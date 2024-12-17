package org.jsoup.nodes;

public class GeneratedIsBlank_thenReturnTrue_whenTextIsBlank {

    @Test
    public void isBlank_thenReturnTrue_whenTextIsBlank() {
        // Arrange
        String text = "";

        // Act
        boolean result = TextNode.isBlank(text);

        // Assert
        assertTrue(result);
    }

}