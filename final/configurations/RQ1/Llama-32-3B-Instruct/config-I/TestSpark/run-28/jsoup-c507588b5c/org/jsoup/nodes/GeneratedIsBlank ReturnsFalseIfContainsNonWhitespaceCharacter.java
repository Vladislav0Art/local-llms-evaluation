package org.jsoup.nodes;

public class GeneratedIsBlank ReturnsFalseIfContainsNonWhitespaceCharacter {

    @Test
    public void isBlank

    ReturnsFalseIfContainsNonWhitespaceCharacter() {
        String rawText = "Hello World!";
        TextNode textNode = new TextNode(rawText);
        assertFalse(textNode.isBlank());
    }

}