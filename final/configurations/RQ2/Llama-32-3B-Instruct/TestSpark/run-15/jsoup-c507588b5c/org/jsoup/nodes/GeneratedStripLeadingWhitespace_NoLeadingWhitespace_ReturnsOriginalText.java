package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_NoLeadingWhitespace_ReturnsOriginalText {

    @Test
    public void stripLeadingWhitespace_NoLeadingWhitespace_ReturnsOriginalText() {
        // Arrange & Act
        String result = StringUtil.stripLeadingWhitespace("");

        // Assert
        assertEquals("test", result);
    }

}