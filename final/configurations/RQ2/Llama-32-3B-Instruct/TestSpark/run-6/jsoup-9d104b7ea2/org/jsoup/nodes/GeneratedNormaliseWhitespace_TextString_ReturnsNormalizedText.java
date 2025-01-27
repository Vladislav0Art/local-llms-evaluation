package org.jsoup.nodes;

public class GeneratedNormaliseWhitespace_TextString_ReturnsNormalizedText {

    @Test
    public void normaliseWhitespace_TextString_ReturnsNormalizedText() {
        // Given
        String text = "   Hello World  ";

        // When
        String normalizedText = StringUtil.normaliseWhitespace(text);

        // Then
        assertNotNull(normalizedText);
        assertEquals("Hello World", normalizedText);
    }

}