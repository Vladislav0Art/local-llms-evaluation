package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespace_MultipleSpacesReturnsTrue {

    @Test
    public void lastCharIsWhitespace_MultipleSpacesReturnsTrue() {
        assertTrue(StringUtil.lastCharIsWhitespace(new StringBuilder("   ")));
    }

}