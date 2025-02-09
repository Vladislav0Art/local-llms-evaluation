package org.jsoup.nodes;

public class GeneratedTestSetsTheTextContentOfTextNodeCorrectly {

    private TextNode node;

    public GeneratedTest() {
        this.node = new TextNode();
    }

    @Test
    public void testSetsTheTextContentOfTextNodeCorrectly() {
        node.setText("New Text");
        assertEquals("New Text", node.text());
    }

}