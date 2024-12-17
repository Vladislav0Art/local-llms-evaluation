package org.jsoup.nodes;

public class GeneratedTestBlankText {

    @Test
    public void testBlankText() {
        // Arrange
        String expected = "  ";
        Document document = new Document();
        Appendable accumulator = new StringBuilder();

        // Act
        TextNode currentNode = new TextNode(document, accumulator);

        // Assert
        assertEquals(expected, currentNode.text());
    }

}