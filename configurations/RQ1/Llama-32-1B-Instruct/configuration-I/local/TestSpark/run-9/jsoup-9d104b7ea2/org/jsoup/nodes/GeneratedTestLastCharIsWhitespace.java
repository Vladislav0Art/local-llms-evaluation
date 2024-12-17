package org.jsoup.nodes;

public class GeneratedTestLastCharIsWhitespace {

    @Test
    public void testLastCharIsWhitespace() {
        // Arrange
        String text = "Hello   World!";
        Document document = new Document();
        Appendable accumulator = new StringBuilder();

        // Act
        TextNode currentNode = new TextNode(document, accumulator);
        currentNode.text(text);

        // Assert
        assertTrue(lastCharIsWhitespace(accumulator));
    }

}