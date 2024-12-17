package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testBlankNode() {
        assertEquals(true, TextNode.isBlank());
    }

    @Test
    public void testTextNodeWithEmptyString() {
        assertEquals("", TextNode.text(""));
    }

    @Test
    public void testTextNodeWithNullString() {
        assertThrows(NullPointerException.class, () -> TextNode.text(null));
    }

    @Test
    public void testSplitText() {
        TextNode text = new TextNode("Hello World");
        TextNode result = text.splitText(6);
        assertEquals(new TextNode("World"), result);
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        String htmlContent = "<p>Hello <b>world</b></p>";
        textNode.addText(htmlContent, accum, document, 0, null);
        assertEquals("<p>Hello <b>world</b></p>", accum.toString());
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        String htmlContent = "<p>Hello <b>world</b></p>";
        textNode.addText(htmlContent, accum, document, 0, null);
        assertEquals("<p>Hello <b>world</b></p>", accum.toString());
    }

    @Test
    public void testToString() {
        TextNode text = new TextNode("Hello World");
        assertEquals("<p>Hello World</p>", text.toString());
    }

    @Test
    public void testClone() {
        TextNode originalText = new TextNode("Hello World");
        TextNode clonedText = (TextNode) originalText.clone();
        assertNotSame(originalText, clonedText);
    }

    @Test
    public void testNormaliseWhitespace() {
        String text = "   Hello World   ";
        assertEquals("Hello World", normaliseWhitespace(text));
    }

    @Test
    public void testStripLeadingWhitespace() {
        StringBuilder sb = new StringBuilder();
        sb.append("   Hello World   ");
        assertEquals("Hello World", stripLeadingWhitespace(sb.toString()));
    }

    @Test
    public void testLastCharIsWhitespace() {
        String text = "   ";
        assertTrue(lastCharIsWhitespace(text));
    }

}