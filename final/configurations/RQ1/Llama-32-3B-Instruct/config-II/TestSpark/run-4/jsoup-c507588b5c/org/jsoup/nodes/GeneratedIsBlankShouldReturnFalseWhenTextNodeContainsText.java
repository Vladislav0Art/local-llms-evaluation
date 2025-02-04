package org.jsoup.nodes;

public class GeneratedIsBlankShouldReturnFalseWhenTextNodeContainsText {

    @Test
    public void isBlankShouldReturnFalseWhenTextNodeContainsText() {
        TextNode node = new TextNode("hello");
        assertFalse(node.isBlank());
    }

}