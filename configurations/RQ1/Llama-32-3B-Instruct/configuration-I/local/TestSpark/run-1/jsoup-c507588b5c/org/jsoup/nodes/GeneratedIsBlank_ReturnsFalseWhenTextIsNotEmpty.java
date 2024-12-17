package org.jsoup.nodes;

public class GeneratedIsBlank_ReturnsFalseWhenTextIsNotEmpty {

    @Test
    public void IsBlank_ReturnsFalseWhenTextIsNotEmpty() {
        String rawText = "Hello World!";
        TextNode textNode = new TextNode(rawText);
        assertFalse(textNode.isBlank());
    }

}