package org.jsoup.nodes;

public class GeneratedTextSet {

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
    public void textSet() {
        String newText = "New Hello World";
        TextNode node = new TextNode("");
        node.setText(newText);
        assertEquals(newText, node.text());
    }

}