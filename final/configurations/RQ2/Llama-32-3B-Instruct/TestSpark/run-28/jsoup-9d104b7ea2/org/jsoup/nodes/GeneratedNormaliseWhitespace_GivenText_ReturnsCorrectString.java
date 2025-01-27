package org.jsoup.nodes;

public class GeneratedNormaliseWhitespace_GivenText_ReturnsCorrectString {

    @Test
    public void normaliseWhitespace_GivenText_ReturnsCorrectString() {
        // Arrange
        String input = "   test  ";

        // Act
        String expectedOutput = StringUtil.normaliseWhitespace(input);

        // Assert
        assertEquals("test", expectedOutput);
    }

}