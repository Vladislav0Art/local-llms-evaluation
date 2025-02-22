package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testTextNodeConstructor() {
        TextNode textNode = new TextNode("Some text");
        assertEquals("Some text", textNode.coreValue());
    }

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        TextNode textNode = new TextNode("Some text");
        assertEquals("Some text", textNode.text());
    }

    @Test
    public void testTextSetter() {
        TextNode textNode = new TextNode("Some text");
        textNode.text("New text");
        assertEquals("New text", textNode.coreValue());
    }

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("Some text");
        assertEquals("Some text", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("Some text");
        TextNode tailNode = textNode.splitText(5);
        assertEquals("Some", textNode.coreValue());
        assertEquals(" text", tailNode.coreValue());
    }

    @Test
    public void testOuterHtmlHead() {
        TextNode textNode = new TextNode("Some text");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlHead(accum, 0, out);
        assertEquals("Some text", accum.toString());
    }

}