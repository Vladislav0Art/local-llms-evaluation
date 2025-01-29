package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testNodeName() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.nodeName());
    }

    @Test
    public void testText() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.text());
        assertEquals("Hello World", node.text(""));
    }

    @Test
    public void testGetWholeText() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.getWholeText());
    }

    @Test
    public void testIsBlank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
        assertFalse(node.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("Hello World");
        assertEquals("", node.splitText(0));
        assertEquals("Hello", node.splitText(2));
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        Document document = new Document();
        Appendable accum = document.newOutputStream();
        outerHtmlHead(accum, 1, document);
        assertEquals("<p>Hello World</p>", String.valueOf(accum));
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        Document document = new Document();
        Appendable accum = document.newOutputStream();
        outerHtmlTail(accum, 1, document);
        assertEquals("<p>Hello World</p>", String.valueOf(accum));
    }

    @Test
    public void testToString() {
        TextNode node = new TextNode("Hello World");
        assertEquals("<p>Hello World</p>", node.toString());
    }

    @Test
    public void testClone() {
        TextNode node1 = new TextNode("Hello World");
        TextNode node2 = node1.clone();
        assertEquals(node1, node2);
    }

    @Test
    public void testCreateFromEncoded() {
        TextNode node = TextNode.createFromEncoded("Hello World");
        assertEquals("Hello World", node.text());
    }

}