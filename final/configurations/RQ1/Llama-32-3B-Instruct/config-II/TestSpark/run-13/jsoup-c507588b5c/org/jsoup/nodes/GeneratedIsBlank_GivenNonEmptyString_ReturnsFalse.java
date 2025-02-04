package org.jsoup.nodes;

public class GeneratedIsBlank_GivenNonEmptyString_ReturnsFalse {

    @Test
    public void isBlank_GivenNonEmptyString_ReturnsFalse() {
        // given
        String text = "test";
        TextNode node = new TextNode(text);

        // when
        boolean result = node.isBlank();

        // then
        assertFalse(result);
    }

}