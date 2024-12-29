package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testnodeName() {
        TextNode textNode = new TextNode("test");
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void testText() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

    @Test
    public void testTextMethod() {
        TextNode textNode = new TextNode("test");
        String text = textNode.text();
        assertEquals("test", text);
    }

    @Test
    public void testGetWholeText() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("test");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("test");
        assertEquals(2, textNode.splitText(1));
        assertEquals(3, textNode.splitText(4));
    }

    @Test
    public void testOuterHtmlHead() {
        Document document = new Document();
        Appendable accum = document.createText("test");
        assertTrue(document.outerHtmlHead(0, "test", document.OutputSettings()).contains("test"));
    }

    @Test
    public void testOuterHtmlTail() {
        Document document = new Document();
        Appendable accum = document.createText("test");
        assertTrue(document.outerHtmlTail(0, "test", document.OutputSettings()).contains("test"));
    }

    @Test
    public void testToString() {
        TextNode textNode = new TextNode("test");
        assertEquals("<text>test</text>", textNode.toString());
    }

    @Test
    public void testClone() {
        TextNode textNode = new TextNode("test");
        TextNode cloned = textNode.clone();
        assertTrue(cloned.text().equals(textNode.text()));
    }

    @Test
    public void testFromEncoded() {
        String encodedText = "test";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("test", textNode.text());
    }

}