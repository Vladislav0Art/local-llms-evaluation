package org.jsoup.nodes;

public class GeneratedNormaliseWhitespace_thenReturnUnencodedText {

    @Test
    public void normaliseWhitespace_thenReturnUnencodedText() {
        // Arrange
        String text = "Hello World";

        // Act
        String result = TextNode.normaliseWhitespace(text);

        // Assert
        assertEquals("Hello World", result);
    }

}