package org.jsoup.nodes;

public class GeneratedIsBlank_returns_true {

    @Test
    public void isBlank_returns_true() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
        assertFalse(node.isBlank());
    }

}