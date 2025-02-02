package org.jsoup.nodes;

public class GeneratedClone_ReturnsCorrectClonedTextNode {

    @Mock
    private org.jsoup.nodes.Document parentNode;

    public TextNode createTextNode(String text) {
        return new org.jsoup.nodes.TextNode(text);
    }

    @Test
    public void clone_ReturnsCorrectClonedTextNode() {
        org.jsoup.nodes.TextNode textNode = new org.jsoup.nodes.TextNode(TEXT_NODE_VALUE);
        org.jsoup.nodes.TextNode clonedTextNode = textNode.clone();

        org.junit.Assert.assertNotNull(clonedTextNode);

        org.junit.Assert.assertEquals(textNode.coreValue(), clonedTextNode.coreValue());
    }

}