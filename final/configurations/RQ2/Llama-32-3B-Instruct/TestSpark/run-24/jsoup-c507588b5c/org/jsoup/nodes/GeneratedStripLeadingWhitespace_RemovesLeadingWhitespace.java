package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_RemovesLeadingWhitespace {

    @Test
    public void stripLeadingWhitespace_RemovesLeadingWhitespace() {
        // Given
        String text = "   Hello World";

        // When
        String result = TextNode.stripLeadingWhitespace(text);

        // Then
        assertEquals("Hello World", result);
    }

}