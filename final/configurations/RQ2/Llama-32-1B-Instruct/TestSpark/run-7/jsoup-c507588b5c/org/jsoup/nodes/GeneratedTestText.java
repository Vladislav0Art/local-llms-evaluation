package org.jsoup.nodes;

public class GeneratedTestText {

    @Test
    public void testText() {
        // Arrange
        Document document = new Document();
        Appendable appender = document.createDocumentFragment();
        String text = "Hello, World!";
        String expectedValue = "Hello, World!";

        // Act
        TextNode textNode = new TextNode(text);

        // Assert
        assertEquals(expectedValue, textNode.text());
    }

}