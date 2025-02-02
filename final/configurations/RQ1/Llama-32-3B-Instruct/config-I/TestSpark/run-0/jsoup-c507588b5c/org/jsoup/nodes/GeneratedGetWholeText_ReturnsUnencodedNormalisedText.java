package org.jsoup.nodes;

public class GeneratedGetWholeText_ReturnsUnencodedNormalisedText {

    @Test
    public void getWholeText_ReturnsUnencodedNormalisedText() {
        // Arrange
        TextNode textNode = new TextNode("   ");

        // Act
        String wholeText = textNode.getWholeText();

        // Assert
        assertEquals("   ", wholeText);
    }

}