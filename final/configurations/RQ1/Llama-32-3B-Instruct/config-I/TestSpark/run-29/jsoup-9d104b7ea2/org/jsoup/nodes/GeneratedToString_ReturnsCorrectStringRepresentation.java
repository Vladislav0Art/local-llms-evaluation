package org.jsoup.nodes;

public class GeneratedToString_ReturnsCorrectStringRepresentation {

    @Mock
    private org.jsoup.nodes.Document parentNode;

    public TextNode createTextNode(String text) {
        return new org.jsoup.nodes.TextNode(text);
    }

    @Test
    public void toString_ReturnsCorrectStringRepresentation() {
        org.jsoup.nodes.TextNode textNode = (org.jsoup.nodes.TextNode) this.createTextNode(TEXT_NODE_VALUE);
        String stringRepresentation = textNode.toString();
        org.junit.Assert.assertNotNull(stringRepresentation);
    }

}