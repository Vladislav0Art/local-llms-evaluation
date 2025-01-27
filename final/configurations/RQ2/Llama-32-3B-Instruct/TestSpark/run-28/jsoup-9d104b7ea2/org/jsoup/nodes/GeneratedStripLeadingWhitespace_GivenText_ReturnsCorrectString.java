package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_GivenText_ReturnsCorrectString {

    @Test
    public void stripLeadingWhitespace_GivenText_ReturnsCorrectString() {
        // Arrange
        String input = "test   ";

        // Act
        String expectedOutput = TextNode.stripLeadingWhitespace(input);

        // Assert
        assertEquals("test", expectedOutput);
    }

}