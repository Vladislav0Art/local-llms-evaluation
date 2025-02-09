package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_LeadingWhitespaceRemovedCorrectly {

    @Test
    public void stripLeadingWhitespace_LeadingWhitespaceRemovedCorrectly() {
        String originalText = "   text ";
        String expected = "text";
        assertEquals(expected, StringUtil.stripLeadingWhitespace(originalText));
    }

}