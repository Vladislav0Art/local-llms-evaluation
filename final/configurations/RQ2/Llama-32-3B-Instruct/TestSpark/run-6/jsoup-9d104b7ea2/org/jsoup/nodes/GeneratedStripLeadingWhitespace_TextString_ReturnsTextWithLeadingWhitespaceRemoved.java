package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_TextString_ReturnsTextWithLeadingWhitespaceRemoved {

    @Test
    public void stripLeadingWhitespace_TextString_ReturnsTextWithLeadingWhitespaceRemoved() {
        // Given
        String text = "   Hello World  ";

        // When
        String strippedText = StringUtil.stripLeadingWhitespace(text);

        // Then
        assertNotNull(strippedText);
        assertEquals("Hello World", strippedText);
    }

}