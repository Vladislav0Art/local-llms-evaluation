package org.jsoup.nodes;

public class GeneratedIsBlank_EmptyText_ReturnsTrue {

    @Test
    public void isBlank_EmptyText_ReturnsTrue() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}