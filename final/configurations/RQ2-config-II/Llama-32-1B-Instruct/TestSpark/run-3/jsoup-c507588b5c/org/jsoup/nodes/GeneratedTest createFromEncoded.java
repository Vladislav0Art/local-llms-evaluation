package org.jsoup.nodes;

public class GeneratedTest createFromEncoded {

    @Test
    public void test

    createFromEncoded() {
        // Arrange
        String encodedText = "hello, world!";
        Document document = new Document();

        // Act
        TextNode textNode = TextNode.createFromEncoded(document, encodedText);

        // Assert
        assertTrue(textNode.text("hello, world!").equals(encodedText));
    }

}