package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void nodeName_BasicTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void nodeName_NullPointerExceptionTest() {
        try {
            new TextNode(null).nodeName();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void text_BasicTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

    @Test
    public void text_NullPointerExceptionTest() {
        try {
            new TextNode(null).text();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void text_WithValueTest() {
        TextNode textNode = new TextNode("test");
        textNode.text("new test");
        assertEquals("new test", textNode.text());
    }

    @Test
    public void getWholeText_BasicTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void isBlank_BasicTest() {
        TextNode textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
        assertFalse(new TextNode("").isBlank());
    }

    @Test
    public void splitText_ValidOffsetTest() {
        TextNode textNode = new TextNode("test");
        TextNode result = textNode.splitText(3);
        assertEquals("te", result.text());
    }

    @Test
    public void outerHtmlHead_AssertionTest() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        Document document = new Document();
        TextNode textNode = new TextNode("<p>Hello World!</p>");
        textNode.outerHtmlHead(accum, 0, out);
        assertEquals("<p>Hello World!</p>", accum.toString());
    }

    @Test
    public void outerHtmlTail_AssertionTest() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("");
        textNode.outerHtmlTail(accum, 0, out);
        assertEquals("", accum.toString());
    }

    @Test
    public void toString_BasicTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("text", textNode.toString());
    }

    @Test
    public void clone_BasicTest() {
        TextNode original = new TextNode("test");
        TextNode clone = original.clone();
        assertNotNull(clone);
        assertEquals("test", clone.text());
    }

    @Test
    public void createFromEncoded_WithValueTest() {
        String encodedText = "test";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals(encodedText, textNode.text());
    }

    @Test
    public void normaliseWhitespace_NullInputTest() {
        assertNull(TextNode.normaliseWhitespace(null));
    }

    @Test
    public void stripLeadingWhitespace_BasicTest() {
        String originalText = "   test ";
        String expectedText = "test";
        assertEquals(expectedText, TextNode.stripLeadingWhitespace(originalText));
    }

    @Test
    public void lastCharIsWhitespace_EmptyStringBuilderTest() {
        StringBuilder sb = new StringBuilder();
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void lastCharIsWhitespace_SingleCharacterNonSpaceTest() {
        char[] buffer = {'!'};
        assertFalse(TextNode.lastCharIsWhitespace(new StringBuilder(buffer)));
    }

}