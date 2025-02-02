package org.jsoup.nodes;

public class GeneratedIsBlank_GivenEmptyText_ReturnsTrue {

    @Test
    public void isBlank_GivenEmptyText_ReturnsTrue() {
        // Given
        String text = "";

        // When
        TextNode textNode = new TextNode(text);

        // Then
        assertTrue(textNode.isBlank());
    }

}