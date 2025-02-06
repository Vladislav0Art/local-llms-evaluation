package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_EmptyText {

    @Test
    public void stripLeadingWhitespace_EmptyText() {
        String text = "";
        assertEquals("", StringUtil.stripLeadingWhitespace(text));
    }

}