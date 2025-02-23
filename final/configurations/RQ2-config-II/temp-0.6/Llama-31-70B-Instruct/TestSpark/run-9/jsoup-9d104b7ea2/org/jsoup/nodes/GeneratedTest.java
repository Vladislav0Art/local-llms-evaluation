package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("some text");
        String nodeName = textNode.nodeName();
        assertEquals("#text", nodeName);
    }

    @Test
    public void testText() {
        TextNode textNode = new TextNode("some text");
        String text = textNode.text();
        assertEquals("some text", text);
    }

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("some text");
        String wholeText = textNode.getWholeText();
        assertEquals("some text", wholeText);
    }

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("some text");
        boolean isBlank = textNode.isBlank();
        assertFalse(isBlank);
    }

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("some text");
        TextNode splitTextNode = textNode.splitText(5);
        assertEquals("some ", textNode.getWholeText());
        assertEquals("text", splitTextNode.getWholeText());
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        TextNode textNode = new TextNode("some text");
        StringWriter writer = new StringWriter();
        textNode.outerHtmlHead(writer, 0, new Document.OutputSettings());
        assertEquals("some text", writer.toString());
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        TextNode textNode = new TextNode("some text");
        StringWriter writer = new StringWriter();
        textNode.outerHtmlTail(writer, 0, new Document.OutputSettings());
        assertEquals("", writer.toString());
    }

}