package org.jsoup.nodes;

public class GeneratedTest {

    private java.io.ByteArrayOutputStream ba;
    private org.jsoup.nodes.OutputSettings out;

    public Node() {
    }

    public String toString() {
        return "Node object";
    }

    public boolean equals(Object obj) {
        return false;
    }
}

public class TestNode {

    @Test
    public void nodeNameEmptyTextTest() {
        TextNode node = new TextNode("");
        assertEquals("", node.nodeName());
    }

    @Test
    public void nodeNameNotEmptyTextTest() {
        TextNode node = new TextNode("Hello");
        assertEquals("text", node.nodeName());
    }

    @Test
    public void textBlankStringTest() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
    }

    @Test
    public void textEmptyStringTest() {
        TextNode node = new TextNode(null);
        assertEquals("", node.text());
    }

    @Test
    public void textNotEmptyStringTest() {
        TextNode node = new TextNode("Hello");
        assertEquals("Hello", node.text());
    }

    @Test
    public void getWholeTextBlankStringTest() {
        TextNode node = new TextNode("");
        assertEquals("", node.getWholeText());
    }

    @Test
    public void getWholeTextNotEmptyStringTest() {
        TextNode node = new TextNode("Hello");
        assertEquals("Hello", node.getWholeText());
    }

    @Test
    public void isBlankBlankStringTest() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void isBlankNotEmptyStringTest() {
        TextNode node = new TextNode("Hello");
        assertFalse(node.isBlank());
    }

    @Test
    public void splitTextOffsetNegativeTest() {
        TextNode node = new TextNode("Hello World");
        assertEquals(null, node.splitText(-1));
    }

    @Test
    public void splitTextOffsetZeroTest() {
        TextNode node = new TextNode("Hello World");
        assertEquals(node, node.splitText(0));
    }

    @Test
    public void cloneTextEqualsOriginalTest() {
        TextNode node1 = new TextNode("Hello");
        TextNode node2 = node1.clone();
        assertEquals(node1, node2);
    }

}