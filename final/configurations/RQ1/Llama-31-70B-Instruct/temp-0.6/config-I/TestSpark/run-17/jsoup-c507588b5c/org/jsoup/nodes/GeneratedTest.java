package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("text");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("text");
        assertFalse(textNode.isBlank());

        textNode = new TextNode("  ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("text");
        TextNode splitNode = textNode.splitText(2);
        assertEquals("te", textNode.getWholeText());
        assertEquals("xt", splitNode.getWholeText());
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        TextNode textNode = new TextNode("text");
        Appendable accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, Document.OutputSettings.createDefault());
        assertEquals("text", accum.toString());
    }

    @Test
    public void testOuterHtmlHeadWithPrettyPrint() throws IOException {
        TextNode textNode = new TextNode("text");
        Appendable accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, Document.OutputSettings.createDefault().prettyPrint(true));
        assertEquals("text", accum.toString());
    }

}