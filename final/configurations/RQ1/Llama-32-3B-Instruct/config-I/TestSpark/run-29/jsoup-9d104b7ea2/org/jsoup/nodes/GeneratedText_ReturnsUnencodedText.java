package org.jsoup.nodes;

public class GeneratedText_ReturnsUnencodedText {

    @Mock
    private org.jsoup.nodes.Document parentNode;

    public TextNode createTextNode(String text) {
        return new org.jsoup.nodes.TextNode(text);
    }

    @Test
    public void text_ReturnsUnencodedText() {
        org.jsoup.nodes.TextNode textNode = (org.jsoup.nodes.TextNode) this.createTextNode(TEXT_NODE_VALUE);
        org.junit.Assert.assertEquals(TEXT_NODE_VALUE, textNode.text());
    }

}