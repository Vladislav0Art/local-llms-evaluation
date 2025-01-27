package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespace_nonEmptyString_returnsTrue {

    @Test
    public void lastCharIsWhitespace_nonEmptyString_returnsTrue() {
        String test = "test";
        assertTrue(StringUtil.lastCharIsWhitespace(new StringBuilder(test)));
    }

}