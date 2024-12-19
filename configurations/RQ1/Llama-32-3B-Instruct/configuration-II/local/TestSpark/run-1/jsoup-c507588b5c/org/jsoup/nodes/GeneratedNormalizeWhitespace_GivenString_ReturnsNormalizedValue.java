package org.jsoup.nodes;

public class GeneratedNormalizeWhitespace_GivenString_ReturnsNormalizedValue {

    @Test
    public void normalizeWhitespace_GivenString_ReturnsNormalizedValue() {
        String input = "   ";
        assertEquals("   ", TextNode.normaliseWhitespace(input));
    }

}