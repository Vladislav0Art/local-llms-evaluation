package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_thenReturnTruncatedString {

    @Test
    public void stripLeadingWhitespace_thenReturnTruncatedString() {
        // Arrange
        StringBuilder sb = new StringBuilder();
        sb.append("   Hello  ");

        // Act
        String result = TextNode.stripLeadingWhitespace(sb.toString());

        // Assert
        assertEquals("Hello ", result);
    }

}