package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void shouldCreateTextNodeBlankText() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.text());
    }

    @Test
    public void shouldSplitTextNode() {
        TextNode textNode = new TextNode("Hello World");
        TextNode splitTextNode = textNode.splitText(7);
        assertEquals("Hello World", splitTextNode.text());
        assertEquals(" ", splitTextNode.getWholeText().substring(6));
    }

    @Test
    public void shouldGetWholeText() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.getText());
    }

    @Test
    public void shouldGetText() {
        TextNode textNode = new TextNode("<p>Hello World</p>");
        assertEquals("<p>Hello World</p>", textNode.getText());
    }

    @Test
    public void shouldIsBlank() {
        TextNode textNode = new TextNode("Hello World");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void shouldNotSplitText() {
        TextNode textNode = new TextNode("<p>Hello World</p>");
        assertEquals("<p>Hello World</p>", textNode.getText());
    }

    @Test
    public void shouldGetOuterHtmlHead() throws IOException {
        // mock the Document object with a suitable implementation
        Document document = MockDocumentFactory.createDocument();
        Appendable appendable = new StringReader("");
        document.setOutputSettings(new Document.OutputSettings().append(appendable));
        TextNode textNode = new TextNode("Hello World");
        assertTrue(textNode.outerHtmlHead(document, 0, null).isBlank());
    }

    @Test
    public void shouldGetOuterHtmlTail() throws IOException {
        // mock the Document object with a suitable implementation
        Document document = MockDocumentFactory.createDocument();
        Appendable appendable = new StringReader("");
        document.setOutputSettings(new Document.OutputSettings().append(appendable));
        TextNode textNode = new TextNode("<p>Hello World</p>");
        assertTrue(textNode.outerHtmlTail(document, 0, null).isBlank());
    }

    @Test
    public void shouldToString() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("<TextNode><Text> Hello &nbsp;World&quot;</Text></TextNode>", textNode.toString());
    }

}