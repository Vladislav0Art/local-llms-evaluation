package org.jsoup.nodes;

public class GeneratedIsBlank_GivenNonEmptyText_ReturnsFalse {

    @Test
    public void isBlank_GivenNonEmptyText_ReturnsFalse() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

}