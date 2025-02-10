package org.jsoup.nodes;

public class GeneratedTestDocumentContainsString {

    @Test
    public void testDocumentContainsString() {
        // Arrange
        Document document = new Document();
        String expectedHtml = "<p>Hello, World!</p>";

        // Act
        boolean result = document.containsString(expectedHtml);

        // Assert
        assertEquals(true, result);
    }

}