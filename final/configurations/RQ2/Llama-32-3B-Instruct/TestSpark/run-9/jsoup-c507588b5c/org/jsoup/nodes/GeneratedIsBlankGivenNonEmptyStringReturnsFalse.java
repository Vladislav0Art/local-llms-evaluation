package org.jsoup.nodes;

public class GeneratedIsBlankGivenNonEmptyStringReturnsFalse {

    @Test
    public void isBlankGivenNonEmptyStringReturnsFalse() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

}