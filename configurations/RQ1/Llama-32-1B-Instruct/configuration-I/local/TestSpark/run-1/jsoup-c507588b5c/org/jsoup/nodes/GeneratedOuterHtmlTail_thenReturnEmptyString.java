package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_thenReturnEmptyString {

    @Test
    public void outerHtmlTail_thenReturnEmptyString() {
        // Arrange
        String text = "";

        // Act
        StringBuilder result = new StringBuilder();
        TextNode test = new TextNode(text);

        test.outerHtmlTail(result, 0, null).append("\n");

        // Assert
        assertEquals("", result.toString());
    }

}