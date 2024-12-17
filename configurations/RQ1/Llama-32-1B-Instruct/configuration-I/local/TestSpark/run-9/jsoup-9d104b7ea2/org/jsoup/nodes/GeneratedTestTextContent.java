package org.jsoup.nodes;

public class GeneratedTestTextContent {

    @Test
    public void testTextContent() {
        // Arrange
        String text = "Hello World!";
        Document document = new Document();
        Appendable accumulator = new StringBuilder();

        // Act
        TextNode currentNode = new TextNode(document, accumulator);
        currentNode.text(text);

        // Assert
        assertEquals(4, (int) currentNode.text().length());
    }

}