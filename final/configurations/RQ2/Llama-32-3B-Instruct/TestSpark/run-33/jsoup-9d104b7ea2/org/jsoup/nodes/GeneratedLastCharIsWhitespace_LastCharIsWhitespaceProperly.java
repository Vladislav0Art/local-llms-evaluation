package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespace_LastCharIsWhitespaceProperly {

    @Test
    public void lastCharIsWhitespace_LastCharIsWhitespaceProperly() {
        StringBuilder sb = new StringBuilder("Hello, World!");
        boolean expectedOutput = true;
        assertTrue(StringUtil.lastCharIsWhitespace(sb.toString()));
    }

}