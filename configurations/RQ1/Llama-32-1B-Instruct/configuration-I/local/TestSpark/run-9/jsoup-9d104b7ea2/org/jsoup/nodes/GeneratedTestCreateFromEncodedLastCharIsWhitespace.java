package org.jsoup.nodes;

public class GeneratedTestCreateFromEncodedLastCharIsWhitespace {

    @Test
    public void testCreateFromEncodedLastCharIsWhitespace() {
        // Arrange
        String encodedText = "&lt;Hello&gt;";
        Document document = new Document();
        Appendable accumulator = new StringBuilder();

        // Act
        TextNode currentNode = new TextNode(document, accumulator);
        currentNode.text(fromEncoded(encodedText));

        // Assert
        assertEquals(4, (int) currentNode.text().length());
    }

    private String fromEncoded(String encodedText) {
        return Entities.unescape(encodedText);
    }

}