package org.jsoup.nodes;

public class GeneratedIsBlank_SingleCharacterText_ReturnsFalse {

    @Test
    public void isBlank_SingleCharacterText_ReturnsFalse() {
        // Given:
        TextNode node = new TextNode("a");

        // When:
        boolean result = node.isBlank();

        // Then:
        assertFalse(result);
    }

}