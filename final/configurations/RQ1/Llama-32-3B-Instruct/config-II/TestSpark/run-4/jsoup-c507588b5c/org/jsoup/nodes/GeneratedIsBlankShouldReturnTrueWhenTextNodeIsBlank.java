package org.jsoup.nodes;

public class GeneratedIsBlankShouldReturnTrueWhenTextNodeIsBlank {

    @Test
    public void isBlankShouldReturnTrueWhenTextNodeIsBlank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}