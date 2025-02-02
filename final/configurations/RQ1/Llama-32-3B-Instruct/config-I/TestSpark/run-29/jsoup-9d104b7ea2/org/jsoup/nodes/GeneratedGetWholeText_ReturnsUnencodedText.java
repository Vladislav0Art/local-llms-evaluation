package org.jsoup.nodes;

public class GeneratedGetWholeText_ReturnsUnencodedText {

    @Mock
    private org.jsoup.nodes.Document parentNode;

    public TextNode createTextNode(String text) {
        return new org.jsoup.nodes.TextNode(text);
    }

    @Test
    public void getWholeText_ReturnsUnencodedText() {
        org.jsoup.nodes.TextNode textNode = (org.jsoup.nodes.TextNode) this.createTextNode(TEXT_NODE_VALUE);
        org.junit.Assert.assertEquals(TEXT_NODE_VALUE, textNode.getWholeText());
    }

}