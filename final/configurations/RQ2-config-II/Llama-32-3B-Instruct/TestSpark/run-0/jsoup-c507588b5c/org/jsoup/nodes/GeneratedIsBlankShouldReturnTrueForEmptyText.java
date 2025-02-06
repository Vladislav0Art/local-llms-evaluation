package org.jsoup.nodes;

public class GeneratedIsBlankShouldReturnTrueForEmptyText {

    @Test
    public void isBlankShouldReturnTrueForEmptyText() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}