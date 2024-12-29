package org.jsoup.nodes;

public class GeneratedNodeName {

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
    public void nodeName() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals("text", node.getClass().getSimpleName());
    }

}