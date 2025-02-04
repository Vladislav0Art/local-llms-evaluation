package org.jsoup.nodes;

public class GeneratedIsBlank_GivenNonEmptyText ReturnsFalse {

    @Test
    public void isBlank_GivenNonEmptyText

    ReturnsFalse() {
        // given
        TextNode textNode = new TextNode("Hello World");

        // when
        boolean isBlank = textNode.isBlank();

        // then
        assertFalse(isBlank);
    }

}