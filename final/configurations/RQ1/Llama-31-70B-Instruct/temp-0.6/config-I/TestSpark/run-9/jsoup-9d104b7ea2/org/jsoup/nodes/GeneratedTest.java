package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        TextNode textNode = new TextNode("   Hello world!   ");
        assertEquals("Hello world!", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("Hello world!");
        assertEquals("Hello world!", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("Hello world!");
        TextNode splittedTextNode = textNode.splitText(6);
        assertEquals("Hello ", textNode.getWholeText());
        assertEquals("world!", splittedTextNode.getWholeText());
    }

    @Test
    public void testSplitTextNegativeOffset() {
        TextNode textNode = new TextNode("Hello world!");
        textNode.splitText(-1);
    }

    @Test
    public void testSplitTextTooBigOffset() {
        TextNode textNode = new TextNode("Hello world!");
        textNode.splitText(12);
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        TextNode textNode = new TextNode("   Hello world!   ");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, new Document.OutputSettings());
        assertEquals("Hello world!", accum.toString());
    }

}