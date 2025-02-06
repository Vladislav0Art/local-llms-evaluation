package org.jsoup.nodes;

public class GeneratedIsBlankShouldReturnFalseForNonEmptyText {

    @Test
    public void isBlankShouldReturnFalseForNonEmptyText() {
        TextNode textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

}