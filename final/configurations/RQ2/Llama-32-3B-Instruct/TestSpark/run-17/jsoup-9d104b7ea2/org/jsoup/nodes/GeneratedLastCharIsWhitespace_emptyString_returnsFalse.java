package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespace_emptyString_returnsFalse {

    @Test
    public void lastCharIsWhitespace_emptyString_returnsFalse() {
        assertFalse(StringUtil.lastCharIsWhitespace(new StringBuilder()));
    }

}