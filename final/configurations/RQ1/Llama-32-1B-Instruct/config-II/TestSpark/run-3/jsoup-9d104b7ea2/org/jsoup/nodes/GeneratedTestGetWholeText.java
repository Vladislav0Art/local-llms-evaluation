package org.jsoup.nodes;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        // Arrange
        String text = "<p>This is a sample paragraph.</p>";

        // Act
        String result = TextNode.getText();

        // Assert
        assertEquals(text, result, "Expected the original text content.");
    }

}