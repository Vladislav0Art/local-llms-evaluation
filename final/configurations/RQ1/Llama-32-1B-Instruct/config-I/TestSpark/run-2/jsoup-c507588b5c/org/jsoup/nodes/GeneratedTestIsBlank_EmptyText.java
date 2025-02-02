package org.jsoup.nodes;

public class GeneratedTestIsBlank_EmptyText {

    @Test
    public void testIsBlank_EmptyText() {
        // Arrange
        String text = "";

        // Act
        boolean result = nodeIsBlank();

        // Assert
        assertTrue(result, "nodeIsBlank() returned unexpected result");
    }

}