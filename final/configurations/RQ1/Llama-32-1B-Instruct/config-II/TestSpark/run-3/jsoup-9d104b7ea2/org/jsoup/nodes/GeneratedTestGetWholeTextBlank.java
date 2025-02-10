package org.jsoup.nodes;

public class GeneratedTestGetWholeTextBlank {

    @Test
    public void testGetWholeTextBlank() {
        // Arrange
        String text = "";

        // Act
        String result = TextNode.getWholeText();

        // Assert
        assertEquals(text, result, "Expected the entire text to match the blank string.");
    }

}