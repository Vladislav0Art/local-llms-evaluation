package org.jsoup.nodes;

public class GeneratedIsBlank {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public void clone() throws CloneNotSupportedException {
        return (TextNode) super.clone();
    }

    public static Document document() {
        Document doc = new Document();
        // implementation
        return doc;
    }
}

public class GeneratedTest {

    @Test
    public void isBlank() {
        TextNode node1 = new TextNode("");
        assertTrue(node1.isBlank());

        TextNode node2 = new TextNode("   ");
        assertTrue(node2.isBlank());

        TextNode node3 = new TextNode("Hello World");
        assertFalse(node3.isBlank());
    }

}