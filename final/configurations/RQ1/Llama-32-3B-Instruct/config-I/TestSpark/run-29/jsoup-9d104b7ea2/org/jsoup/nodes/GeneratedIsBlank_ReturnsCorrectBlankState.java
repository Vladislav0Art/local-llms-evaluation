package org.jsoup.nodes;

public class GeneratedIsBlank_ReturnsCorrectBlankState {

    @Mock
    private org.jsoup.nodes.Document parentNode;

    public TextNode createTextNode(String text) {
        return new org.jsoup.nodes.TextNode(text);
    }

    @Test
    public void isBlank_ReturnsCorrectBlankState() {
        org.jsoup.nodes.TextNode textNode = new org.jsoup.nodes.TextNode("");
        org.junit.Assert.assertTrue(textNode.isBlank());

        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("   ");
        org.junit.Assert.assertTrue(textNode2.isBlank());

        org.jsoup.nodes.TextNode textNode3 = new org.jsoup.nodes.TextNode(TEXT_NODE_VALUE);
        org.junit.Assert.assertFalse(textNode3.isBlank());
    }

}