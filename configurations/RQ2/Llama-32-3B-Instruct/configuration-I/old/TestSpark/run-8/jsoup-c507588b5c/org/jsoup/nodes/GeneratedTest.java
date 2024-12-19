package org.jsoup.nodes;

public class GeneratedTest {

}

public class Node {
}

public class ByteArrayOutputStream {
}

public class GeneratedTest {

    @Test
    public void constructor_TextProvided_Works() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
        assertEquals(text, textNode.text());
    }

    @Test
    public void nodeName_NamedNode_ReturnsCorrectName() {
        TextNode textNode = new TextNode("test");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void text_TextProvided_Works() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode.text());
        assertEquals(text, textNode.text());
    }

    @Test
    public void text_TextChanged_SameTextRetured() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        textNode = textNode.text("New Text");
        assertEquals(text, textNode.text());
    }

    @Test
    public void getWholeText_TextContents_ReturnsCorrectText() {
        String text = "Hello\nWorld";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

    @Test
    public void isBlank_NoText_ReturnsTrue() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_HaveText_ReturnsFalse() {
        String text = "Hello";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitText_SplitAtOffset_ReturnsCorrectSplitText() throws IOException {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        int offset = 6;
        TextNode result = textNode.splitText(offset);
        assertNotNull(result);
        assertEquals("World", result.text());
    }

    @Test
    public void outerHtmlTail_NoNodes_ThrowsNoException() {
        TextNode textNode = new TextNode("");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        textNode.outerHtmlTail(null, 0, outputSettings);
    }

    @Test
    public void clone_ClonedText_ReturnsCorrectClonedText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        TextNode clonedTextNode = textNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(text, clonedTextNode.text());
    }

    @Test
    public void createFromEncoded_DecodedText_ReturnsCorrectEncodedText() {
        String encodedText = "&lt;Hello&gt; World";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
        assertEquals("Hello World", textNode.text());
    }

    @Test
    public void normaliseWhitespace_SingleSpace_ReturnsCorrectWhitespace() {
        String text = " ";
        String result = TextNode.normaliseWhitespace(text);
        assertEquals("", result);
    }

    @Test
    public void stripLeadingWhitespace_NoLeadingWhitespace_ReturnsNoWhitespace() {
        String text = "";
        String result = TextNode.stripLeadingWhitespace(text);
        assertEquals("", result);
    }

    @Test
    public void stripLeadingWhitespace_WithLeadingWhitespace_ReturnsCorrectWhitespace() {
        String text = "   ";
        String result = TextNode.stripLeadingWhitespace(text);
        assertEquals(" ", result);
    }

    @Test
    public void lastCharIsWhitespace_SingleSpace_ReturnsTrue() {
        StringBuilder sb = new StringBuilder(" ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void lastCharIsWhitespace_NoWhitespace_ReturnsFalse() {
        StringBuilder sb = new StringBuilder("Hello");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}