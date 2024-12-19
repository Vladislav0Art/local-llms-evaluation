package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void isBlank() {
        TextNode node = new TextNode("   ");
        assertTrue(node.isBlank());
    }

    @Test
    public void isBlank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void isBlank() {
        TextNode node = new TextNode("\t");
        assertTrue(node.isBlank());
    }

    @Test
    public void splitText() {
        TextNode node1 = new TextNode("Hello World");
        TextNode node2 = node1.splitText(10);
        assertNotNull(node2);
        assertEquals("World", node2.text().trim());
    }

    @Test
    public void splitText() {
        TextNode node1 = new TextNode("   Hello  World");
        TextNode node2 = node1.splitText(5);
        assertNotNull(node2);
        assertEquals("Hello ", node2.text().trim());
    }

    @Test
    public void splitText() {
        TextNode node1 = new TextNode("\n\nHello\nWorld");
        TextNode node2 = node1.splitText(10);
        assertNotNull(node2);
        assertEquals("  World", node2.text().trim());
    }

    @Test
    public void clone() {
        TextNode node = new TextNode("   ");
        TextNode clonedNode = (TextNode) node.clone();
        assertNotNull(clonedNode);
        assertEquals(node, clonedNode);
    }

    @Test
    public void outerHtmlHead() throws IOException {
        StringBuilder buffer = new StringBuilder();
        TextNode node = new TextNode("<p>Hello World</p>");
        String result = node.outerHtmlHead(buffer, 0, null);
        assertNotNull(result);
        assertEquals("<p><script>alert('Hello World')</script></p>", result.toString());
    }

    @Test
    public void outerHtmlTail() throws IOException {
        StringBuilder buffer = new StringBuilder();
        TextNode node = new TextNode("<p>Hello World</p>");
        String result = node.outerHtmlTail(buffer, 0, null);
        assertNotNull(result);
        assertEquals("<p>Hello World</p>", result.toString());
    }

    @Test
    public void toString() {
        TextNode node = new TextNode("   ");
        assertEquals("<TextNode><text>   </text></TextNode>", node.toString());
    }

    @Test
    public void toString() {
        TextNode node = new TextNode("");
        assertEquals("<TextNode><text></text></TextNode>", node.toString());
    }

    @Test
    public void toString() {
        TextNode node = new TextNode("\t");
        assertEquals("<TextNode><text>\t</text></TextNode>", node.toString());
    }

}