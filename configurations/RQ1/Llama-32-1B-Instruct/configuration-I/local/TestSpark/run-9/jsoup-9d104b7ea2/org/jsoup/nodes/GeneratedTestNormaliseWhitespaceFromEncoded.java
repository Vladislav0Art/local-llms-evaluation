package org.jsoup.nodes;

public class GeneratedTestNormaliseWhitespaceFromEncoded {

    @Test
    public void testNormaliseWhitespaceFromEncoded() {
        // Arrange
        String encodedText = "&lt;Hello&amp;gt;";
        Document document = new Document();
        Appendable accumulator = new StringBuilder();

        // Act
        TextNode currentNode = new TextNode(document, accumulator);
        currentNode.text(fromEncoded(encodedText));

        // Assert
        assertEquals(4, (int) currentNode.text().length());
    }

}