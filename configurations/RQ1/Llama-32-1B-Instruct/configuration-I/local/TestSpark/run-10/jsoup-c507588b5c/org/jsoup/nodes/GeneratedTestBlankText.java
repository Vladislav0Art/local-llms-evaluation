package org.jsoup.nodes;

public class GeneratedTestBlankText {

    @Test
    public void testBlankText() {
        // Arrange
        String text = "";

        // Act
        boolean isBlank = TextNode.isBlank();

        // Assert
        assertEquals(true, isBlank);
    }

}