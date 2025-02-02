package org.jsoup.nodes;

public class GeneratedIsBlank_TextIsNotBlank_ReturnsFalse {

    private Document parentNode;
    private Document document;

    @Test
    public void isBlank_TextIsNotBlank_ReturnsFalse() {
        parentNode = document;
        TextNode textNode = new TextNode("Hello World");
        textNode.parentNode = parentNode;
        assertFalse(textNode.isBlank());
    }

}