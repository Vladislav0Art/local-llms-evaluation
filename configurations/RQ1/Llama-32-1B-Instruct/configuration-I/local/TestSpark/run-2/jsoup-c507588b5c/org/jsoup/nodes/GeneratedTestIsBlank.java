package org.jsoup.nodes;

public class GeneratedTestIsBlank {

    private static String text = "Hello World";

    @Test
    public void testIsBlank() {
        // Arrange
        Document document = new Document();
        Appendable appendable = document.append(text);

        // Act
        boolean result = TextNode.isBlank(appendable);

        // Assert
        assertFalse(result);
    }

}