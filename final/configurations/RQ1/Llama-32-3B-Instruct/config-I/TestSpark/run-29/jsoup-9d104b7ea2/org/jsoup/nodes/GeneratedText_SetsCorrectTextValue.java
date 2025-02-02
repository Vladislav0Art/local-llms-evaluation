package org.jsoup.nodes;

public class GeneratedText_SetsCorrectTextValue {

    @Mock
    private org.jsoup.nodes.Document parentNode;

    public TextNode createTextNode(String text) {
        return new org.jsoup.nodes.TextNode(text);
    }

    @Test
    public void text_SetsCorrectTextValue() {
        org.jsoup.nodes.TextNode textNode = new org.jsoup.nodes.TextNode();
        textNode.text(TEXT_NODE_VALUE);
        org.junit.Assert.assertEquals(TEXT_NODE_VALUE, textNode.coreValue());
    }

}