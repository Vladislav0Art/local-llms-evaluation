package org.jsoup.nodes;

public class GeneratedTestTextFromEncoded {

    @Test
    public void testTextFromEncoded() {
        // Arrange
        Document document = new Document();
        Appendable appender = document.createDocumentFragment();
        String encodedText = "Hello, World!";
        TextNode expectedTextNode = new TextNode(encodedText);

        // Act
        TextNode textNode = new TextNode.fromEncoded(encodedText);

        // Assert
        assertEquals(expectedTextNode, textNode);
    }

}