package org.jsoup.nodes;

public class GeneratedIsBlank_TextIsBlank_ReturnsTrue {

    private Document parentNode;
    private Document document;

    @Test
    public void isBlank_TextIsBlank_ReturnsTrue() {
        parentNode = document;
        TextNode textNode = new TextNode("");
        textNode.parentNode = parentNode;
        assertTrue(textNode.isBlank());
    }

}