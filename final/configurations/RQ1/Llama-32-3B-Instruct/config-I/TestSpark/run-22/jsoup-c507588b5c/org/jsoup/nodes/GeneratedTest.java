package org.jsoup.nodes;

public class GeneratedTest {

    public TextNode testTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void createTextNodeText() {
        TextNode textNode = testTextNode("Hello");
        assertEquals("Hello", textNode.text());
    }

    @Test
    public void createTextNodeBlank() {
        TextNode textNode = testTextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void setTextNodeText() {
        TextNode textNode = testTextNode("");
        textNode.setText("Hello");
        assertEquals("Hello", textNode.text());
    }

    @Test
    public void getWholeText() {
        TextNode textNode = testTextNode("Hello World!");
        assertEquals("Hello World!", textNode.getWholeText().text());
    }

    @Test
    public void splitTextOffset() throws IOException {
        TextNode textNode = testTextNode("Hello World!");
        int offset = 6;
        TextNode tailNode = textNode.splitText(offset);
        assertEquals(7, tailNode.text().length());
    }

    @Test
    public void outerHtmlHeadWithTrailingWhitespace() throws IOException {
        Document document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(out);
        TextNode textNode = testTextNode("   ");
        textNode.outerHtmlHead(writer, 0, document.outputSettings());
        assertEquals("\n", out.toString().trim());
    }

    @Test
    public void outerHtmlHeadWithLeadingWhitespace() throws IOException {
        Document document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(out);
        TextNode textNode = testTextNode("   ");
        textNode.outerHtmlHead(writer, 0, document.outputSettings());
        assertEquals("\n", out.toString().trim());
    }

    @Test
    public void outerHtmlTail() throws IOException {
        Document document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(out);
        TextNode textNode = testTextNode("");
        textNode.outerHtmlTail(writer, 0, null);
        assertEquals("", out.toString().trim());
    }

    @Test
    public void outerHtmlHeadDepth() throws IOException {
        Document document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(out);
        TextNode textNode = testTextNode("   ");
        textNode.outerHtmlHead(writer, 1, document.outputSettings());
        assertEquals("\n", out.toString().trim());
    }

}