package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_thenReturnEmptyString {

    @Test
    public void outerHtmlHead_thenReturnEmptyString() {
        // Arrange
        String text = "";

        // Act
        StringBuilder result = new StringBuilder();
        TextNode test = new TextNode(text);

        test.outerHtmlHead(result, 0, null).append("\n");

        // Assert
        assertEquals("", result.toString());
    }

}