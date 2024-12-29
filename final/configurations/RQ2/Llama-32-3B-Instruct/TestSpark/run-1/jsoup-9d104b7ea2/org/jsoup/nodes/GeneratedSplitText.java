package org.jsoup.nodes;

public class GeneratedSplitText {

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
    public void splitText() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        TextNode node1 = (TextNode) node.splitText(0);
        assertEquals(text.substring(0, 5), node1.text());

        TextNode node2 = (TextNode) node.splitText(5);
        assertEquals("World", node2.text());
    }

}