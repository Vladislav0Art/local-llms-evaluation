package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_MultipleSpaces {

    @Test
    public void stripLeadingWhitespace_MultipleSpaces() {
        String text = "   ";
        assertEquals("   ", StringUtil.stripLeadingWhitespace(text));
    }

}