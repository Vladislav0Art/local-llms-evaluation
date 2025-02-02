package org.jsoup.nodes;

public class GeneratedTestTextNodeCreation {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public String getWholeText() {
        return text;
    }

    public org.jsoup.nodes.TextNode splitText(int offset) throws org.jsoup.nodes.NodeWithTextException {
        // Implement logic to handle offset
        return null;
    }

    public boolean isBlank() {
        return this.text.isEmpty();
    }
}

class TestNodeTest {

    @Test
    public void testTextNodeCreation() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        org.junit.Assert.assertEquals("Hello, World!", node.getWholeText());
    }

}