package org.jsoup.nodes;

public class GeneratedNormaliseWhitespace_EmptyString_ReturnsEmptyString {

    @Test
    public void normaliseWhitespace_EmptyString_ReturnsEmptyString() {
        String expected = "";
        String actual = StringUtil.normaliseWhitespace("");
        assertEquals(expected, actual);
    }

}