package org.jsoup.nodes;

public class GeneratedIsBlank_GivenNonBlankText_ReturnsFalse {

    @Test
    public void isBlank_GivenNonBlankText_ReturnsFalse() {
        TextNode textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

}