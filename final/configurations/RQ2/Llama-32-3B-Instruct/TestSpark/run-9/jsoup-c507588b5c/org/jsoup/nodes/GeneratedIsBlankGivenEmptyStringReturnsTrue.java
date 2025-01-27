package org.jsoup.nodes;

public class GeneratedIsBlankGivenEmptyStringReturnsTrue {

    @Test
    public void isBlankGivenEmptyStringReturnsTrue() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}