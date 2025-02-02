package org.jsoup.nodes;

public class GeneratedIsBlank_GivenEmptyText_ReturnsTrue {

    @Test
    public void isBlank_GivenEmptyText_ReturnsTrue() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

}