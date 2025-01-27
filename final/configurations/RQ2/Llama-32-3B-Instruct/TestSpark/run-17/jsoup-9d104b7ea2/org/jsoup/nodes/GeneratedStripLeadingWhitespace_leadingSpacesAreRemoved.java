package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_leadingSpacesAreRemoved {

    @Test
    public void stripLeadingWhitespace_leadingSpacesAreRemoved() {
        String text = "   test";
        String expectedOutput = "test";
        assertEquals(expectedOutput, StringUtil.stripLeadingWhitespace(text));
    }

}