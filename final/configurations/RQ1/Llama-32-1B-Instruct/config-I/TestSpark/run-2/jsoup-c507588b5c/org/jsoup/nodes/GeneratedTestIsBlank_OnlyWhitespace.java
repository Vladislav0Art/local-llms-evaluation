package org.jsoup.nodes;

public class GeneratedTestIsBlank_OnlyWhitespace {

    @Test
    public void testIsBlank_OnlyWhitespace() {
        // Arrange
        String text = "   ";

        // Act
        boolean result = nodeIsBlank();

        // Assert
        assertTrue(result, "nodeIsBlank() returned unexpected result");
    }

}