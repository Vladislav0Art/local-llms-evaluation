package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_WithLeadingWhitespace_ReturnsCorrectText {

    @Test
    public void stripLeadingWhitespace_WithLeadingWhitespace_ReturnsCorrectText() {
        // Arrange & Act
        String result = StringUtil.stripLeadingWhitespace("   test");

        // Assert
        assertEquals("test", result);
    }

}