package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_EmptyString_ReturnsEmptyString {

    @Test
    public void stripLeadingWhitespace_EmptyString_ReturnsEmptyString() {
        String expected = "";
        String actual = StringUtil.stripLeadingWhitespace("");
        assertEquals(expected, actual);
    }

}