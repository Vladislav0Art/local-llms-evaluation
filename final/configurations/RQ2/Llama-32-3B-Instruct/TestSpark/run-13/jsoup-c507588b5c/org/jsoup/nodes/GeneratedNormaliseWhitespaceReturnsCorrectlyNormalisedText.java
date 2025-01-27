package org.jsoup.nodes;

public class GeneratedNormaliseWhitespaceReturnsCorrectlyNormalisedText {

    @Test
    public void normaliseWhitespaceReturnsCorrectlyNormalisedText() {
        // Given
        String text = "   Hello World   ";
        String expectedText = "Hello World";
        StringBuilder sb = new StringBuilder(text);

        // When
        String normalisedText = TextNode.normaliseWhitespace(sb.toString());

        // Then
        assertEquals(expectedText, normalisedText);
    }

}