package org.jsoup.nodes;

public class GeneratedTestIsBlank {

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
    public void testIsBlank() throws org.jsoup.nodes.NodeWithTextException {
        String text = "";
        TextNode node = new TextNode(text);
        org.junit.Assert.assertTrue(node.isBlank());
    }
}

}