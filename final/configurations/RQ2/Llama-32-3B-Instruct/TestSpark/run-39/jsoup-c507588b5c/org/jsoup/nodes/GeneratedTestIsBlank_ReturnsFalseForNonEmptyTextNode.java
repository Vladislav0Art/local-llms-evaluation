package org.jsoup.nodes;

public class GeneratedTestIsBlank_ReturnsFalseForNonEmptyTextNode {

    private TextNode node;

    public GeneratedTest() {
        this.node = new TextNode();
    }

    @Test
    public void testIsBlank_ReturnsFalseForNonEmptyTextNode() {
        node.setText("Hello");
        assertFalse(node.isBlank());
    }

}