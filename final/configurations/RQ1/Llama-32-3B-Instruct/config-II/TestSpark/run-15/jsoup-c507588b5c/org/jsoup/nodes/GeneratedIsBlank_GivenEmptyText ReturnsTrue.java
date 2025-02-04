package org.jsoup.nodes;

public class GeneratedIsBlank_GivenEmptyText ReturnsTrue {

    @Test
    public void isBlank_GivenEmptyText

    ReturnsTrue() {
        // given
        TextNode textNode = new TextNode("");

        // when
        boolean isBlank = textNode.isBlank();

        // then
        assertTrue(isBlank);
    }

}