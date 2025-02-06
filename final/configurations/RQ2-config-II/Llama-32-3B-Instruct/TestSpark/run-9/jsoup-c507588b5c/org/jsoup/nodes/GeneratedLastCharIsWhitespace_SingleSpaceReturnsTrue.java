package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespace_SingleSpaceReturnsTrue {

    @Test
    public void lastCharIsWhitespace_SingleSpaceReturnsTrue() {
        assertTrue(StringUtil.lastCharIsWhitespace(new StringBuilder(" ")));
    }

}