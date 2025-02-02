package org.jsoup.nodes;

public class GeneratedIsBlank_GivenBlankText_ReturnsTrue {

    @Test
    public void isBlank_GivenBlankText_ReturnsTrue() {
        // Given
        TextNode textNode = new TextNode("");

        // When
        boolean blank = textNode.isBlank();

        // Then
        assertTrue(blank);
    }

}