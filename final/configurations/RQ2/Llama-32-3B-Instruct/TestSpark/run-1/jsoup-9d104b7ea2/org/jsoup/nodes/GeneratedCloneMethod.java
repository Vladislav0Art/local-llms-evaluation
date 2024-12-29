package org.jsoup.nodes;

public class GeneratedCloneMethod {

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
    public void cloneMethod() throws CloneNotSupportedException {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        TextNode clonedNode = (TextNode) node.clone();
        assertNotNull(clonedNode);
        assertEquals(text, clonedNode.text());
    }

}