package org.jsoup.nodes;

public class GeneratedNormaliseWhitespace_ImprovesWhitespaceConsistency {

    @Test
    public void normaliseWhitespace_ImprovesWhitespaceConsistency() {
        // Given
        String text = "   Hello   World";

        // When
        String result = TextNode.normaliseWhitespace(text);

        // Then
        assertEquals("Hello World", result);
    }

}