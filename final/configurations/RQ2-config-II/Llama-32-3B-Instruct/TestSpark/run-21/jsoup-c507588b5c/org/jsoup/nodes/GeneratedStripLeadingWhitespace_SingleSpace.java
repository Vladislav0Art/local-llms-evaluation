package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_SingleSpace {

    @Test
    public void stripLeadingWhitespace_SingleSpace() {
        String text = " ";
        assertEquals(" ", StringUtil.stripLeadingWhitespace(text));
    }

}