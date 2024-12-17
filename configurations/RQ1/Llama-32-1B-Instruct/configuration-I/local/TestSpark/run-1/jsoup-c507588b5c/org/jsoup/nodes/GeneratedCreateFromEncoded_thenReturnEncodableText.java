package org.jsoup.nodes;

public class GeneratedCreateFromEncoded_thenReturnEncodableText {

    @Test
    public void createFromEncoded_thenReturnEncodableText() {
        // Arrange
        String encodedText = "&lt;Hello&gt;";

        // Act
        TextNode result = TextNode.createFromEncoded(encodedText);

        // Assert
        assertEquals("&lt;Hello&gt;", result.text());
    }

}