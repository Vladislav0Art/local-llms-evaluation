package org.jsoup.nodes;

public class GeneratedIsBlank_ReturnsTrueForEmptyString {

    @Test
    public void isBlank_ReturnsTrueForEmptyString() {
        // Given
        TextNode node = new TextNode("");

        // When
        boolean result = node.isBlank();

        // Then
        assertTrue(result);
    }

}