package org.jsoup.nodes;

public class GeneratedNormaliseWhitespace_WithMultipleSpacesReturnsCorrectString {

    @Test
    public void normaliseWhitespace_WithMultipleSpacesReturnsCorrectString() {
        assertEquals("  ", StringUtil.normaliseWhitespace("   "));
    }

}