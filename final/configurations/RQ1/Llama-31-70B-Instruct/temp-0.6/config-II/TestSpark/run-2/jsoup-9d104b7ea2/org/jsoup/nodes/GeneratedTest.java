package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        TextNode textNode = new TextNode("test text");
        assertEquals("test text", textNode.text());
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("test text");
        assertEquals("test text", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode(" ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("test text");
        TextNode tailNode = textNode.splitText(5);
        assertEquals("test ", textNode.getWholeText());
        assertEquals("text", tailNode.getWholeText());
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        TextNode textNode = new TextNode("test text");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlHead(accum, 0, out);
        verify(accum).append("test text");
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        TextNode textNode = new TextNode("test text");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlTail(accum, 0, out);
        verify(accum, never()).append(anyString());
    }

}