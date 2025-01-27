package org.jsoup.nodes;

public class GeneratedNormaliseWhitespace_leadingSpacesAreRemoved {

    @Test
    public void normaliseWhitespace_leadingSpacesAreRemoved() {
        String text = "   test";
        String expectedOutput = "test";
        assertEquals(expectedOutput, StringUtil.normaliseWhitespace(text));
    }

}