package org.jsoup.nodes;

public class GeneratedCreateFromEncodedTextNode_GivenEncodedText_ReturnsCorrectTextNode {

    @Test
    public void createFromEncodedTextNode_GivenEncodedText_ReturnsCorrectTextNode() {
        // Arrange
        String encodedText = "test";

        // Act
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        // Assert
        assertNotNull(textNode);
        assertEquals("test", textNode.text());
    }

}