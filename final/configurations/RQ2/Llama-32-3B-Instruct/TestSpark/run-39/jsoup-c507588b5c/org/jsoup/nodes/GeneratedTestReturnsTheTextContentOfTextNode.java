package org.jsoup.nodes;

public class GeneratedTestReturnsTheTextContentOfTextNode {

    private TextNode node;

    public GeneratedTest() {
        this.node = new TextNode();
    }

    @Test
    public void testReturnsTheTextContentOfTextNode() {
        node.setText("Hello, World!");
        String actual = node.text();
        assertEquals("Hello, World!", actual);
    }

}