package org.jsoup.nodes;

public class GeneratedTestIsBlank_ReturnsTrueForEmptyTextNode {

    private TextNode node;

    public GeneratedTest() {
        this.node = new TextNode();
    }

    @Test
    public void testIsBlank_ReturnsTrueForEmptyTextNode() {
        node.setText("");
        assertTrue(node.isBlank());
    }

}