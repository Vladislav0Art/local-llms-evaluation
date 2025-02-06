package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_SimpleStringReturnsModifiedValue {

    @Test
    public void stripLeadingWhitespace_SimpleStringReturnsModifiedValue() {
        // Arrange
        String text = "   test";

        // Act
        String actual = TextNode.stripLeadingWhitespace(text);

        // Assert
        assertEquals("test", actual);
    }

}