package org.jsoup.nodes;

public class GeneratedIsBlank_WhenTextIsEmpty {

    @Test
    public void isBlank_WhenTextIsEmpty() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}