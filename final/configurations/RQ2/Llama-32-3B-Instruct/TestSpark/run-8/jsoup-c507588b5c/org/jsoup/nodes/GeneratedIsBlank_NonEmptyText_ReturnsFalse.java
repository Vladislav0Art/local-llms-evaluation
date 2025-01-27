package org.jsoup.nodes;

public class GeneratedIsBlank_NonEmptyText_ReturnsFalse {

    @Test
    public void isBlank_NonEmptyText_ReturnsFalse() {
        TextNode node = new TextNode("Hello");
        assertFalse(node.isBlank());
    }

}