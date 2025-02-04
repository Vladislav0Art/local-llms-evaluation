package org.jsoup.nodes;

public class Generated[TextNodeGetWholeText]

ShouldReturnUnencodedTextIncludingNewlinesAndSpaces {

    @Test
    public void [TextNodeGetWholeText]ShouldReturnUnencodedTextIncludingNewlinesAndSpaces() {
        // Arrange
        String expectedText = "Hello World";

        // Act
        TextNode textNode = new TextNode(expectedText);
        String actualText = textNode.getWholeText();

        // Assert
        assertEquals(expectedText, actualText);
    }

}