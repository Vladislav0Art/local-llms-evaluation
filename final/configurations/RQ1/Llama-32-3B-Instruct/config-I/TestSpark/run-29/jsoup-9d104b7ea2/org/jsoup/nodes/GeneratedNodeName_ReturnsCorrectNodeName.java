package org.jsoup.nodes;

public class GeneratedNodeName_ReturnsCorrectNodeName {

    @Mock
    private org.jsoup.nodes.Document parentNode;

    public TextNode createTextNode(String text) {
        return new org.jsoup.nodes.TextNode(text);
    }

    @Test
    public void nodeName_ReturnsCorrectNodeName() {
        org.jsoup.nodes.TextNode textNode = (org.jsoup.nodes.TextNode) this.createTextNode(TEXT_NODE_VALUE);
        org.junit.Assert.assertEquals("#text", textNode.nodeName());
    }

}