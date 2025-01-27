package org.jsoup.nodes;

public class GeneratedNormaliseWhitespaceGivenMultipleSpacesReturnsProperlyNormalisedString {

    @Test
    public void normaliseWhitespaceGivenMultipleSpacesReturnsProperlyNormalisedString() {
        String text = "   Hello, World!  ";
        String result = StringUtil.normaliseWhitespace(text);
        assertEquals("Hello, World!", result);
    }

}