package org.jsoup.nodes;

public class GeneratedTextReturnsUnencodedNormalisedTextCorrectly {

    @Test
    public void textReturnsUnencodedNormalisedTextCorrectly() {
        // Arrange
        String text = "   ";

        // Act
        TextNode textNode = new TextNode(text);
        String textContent = textNode.text();

        // Assert
        assertEquals(StringUtil.normaliseWhitespace("   "), textContent);
    }

}