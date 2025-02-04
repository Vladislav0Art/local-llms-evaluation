package org.jsoup.nodes;

public class Generated[TextNodeCreateFromEncoded]

ShouldReturnTextNodeWithUnencodedData {

    @Test
    public void [TextNodeCreateFromEncoded]ShouldReturnTextNodeWithUnencodedData() {
        // Arrange
        String expectedEncodedText = "&lt;Hello World&gt;";
        String expectedUnencodedText = "Hello World";

        // Act
        TextNode textNode = TextNode.createFromEncoded(expectedEncodedText);

        // Assert
        assertEquals(expectedUnencodedText, textNode.text());
    }

}