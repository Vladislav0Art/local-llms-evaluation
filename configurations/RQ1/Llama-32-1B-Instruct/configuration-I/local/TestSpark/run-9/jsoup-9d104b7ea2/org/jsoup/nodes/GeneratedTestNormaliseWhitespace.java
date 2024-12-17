package org.jsoup.nodes;

public class GeneratedTestNormaliseWhitespace {

    @Test
    public void testNormaliseWhitespace() {
        // Arrange
        String text = "   Hello World!   ";
        Document document = new Document();
        Appendable accumulator = new StringBuilder();

        // Act
        TextNode currentNode = new TextNode(document, accumulator);
        currentNode.text(text);

        // Assert
        assertEquals(4, (int) currentNode.text().length());
    }

}