package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void createTextNodeWithRawText_ValidTest() {
        String rawText = "Hello World";
        TextNode textNode = new TextNode(rawText);
        assertEquals(rawText, textNode.text());
        assertNotNull(textNode.parentNode());
    }

    @Test
    public void text

    Method_ReturnsNormalizedWhitespaceText() {
        String rawText = "\n   \t";
        TextNode textNode = new TextNode(rawText);
        String result = textNode.text();
        assertTrue(result.contains("\n"));
        assertTrue(result.contains(" "));
    }

    @Test
    public void isBlank

    ReturnsFalseIfContainsNonWhitespaceCharacter() {
        String rawText = "Hello World!";
        TextNode textNode = new TextNode(rawText);
        assertFalse(textNode.isBlank());
    }

    @Test
    public void isBlank

    ReturnsTrueIfIsBlank() {
        String rawText = "\n   \t";
        TextNode textNode = new TextNode(rawText);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitText_SplitsAtCorrectOffset() {
        String rawText = "Hello World!";
        int offset = 5;
        TextNode textNode = new TextNode(rawText);
        TextNode tailNode = textNode.splitText(offset);
        assertEquals("World!", tailNode.text());
        assertEquals("Hello", textNode.text());
    }

    @Test
    public void splitText_SplitsAtEndIfOffsetIsGreaterThanOrEqualLength() {
        String rawText = "Hello World!";
        int offset = 10;
        TextNode textNode = new TextNode(rawText);
        TextNode tailNode = textNode.splitText(offset);
        assertEquals("", tailNode.text());
        assertEquals("Hello World!", textNode.text());
    }

    @Test
    public void outerHtmlHead_DoesNotIncludeWhitespaceInTextOutput() {
        String rawText = "\n   \t";
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true, true);
        TextNode textNode = new TextNode(rawText);
        try {
            textNode.outerHtmlHead(accum, 0, out);
            assertEquals("Hello World!", accum.toString());
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void outerHtmlTailDoesNotOutputAnyThing() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true, true);
        TextNode textNode = new TextNode("");
        try {
            textNode.outerHtmlTail(accum, 0, out);
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void clone_ReturnsSameObject() {
        String rawText = "Hello World!";
        TextNode textNode = new TextNode(rawText);
        TextNode clonedTextNode = textNode.clone();
        assertEquals(textNode, clonedTextNode);
    }

    @Test
    public void createFromEncoded_UndoesHtmlEscaping() {
        String encodedText = "&lt;Hello World!&gt;";
        String rawText = "Hello World!";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals(rawText, textNode.text());
    }

    @Test
    public void stripLeadingWhitespace_LeavesOriginalCharacters() {
        String originalText = "\n   \t";
        String strippedText = "Hello World!";
        assertTrue(strippedText.equals(originalText));
    }

    @Test
    public void lastCharIsWhitespace_ChecksLastCharacterOnly() {
        StringBuilder sb = new StringBuilder("Hello World!");
        assertTrue(lastCharIsWhitespace(sb));
    }

}