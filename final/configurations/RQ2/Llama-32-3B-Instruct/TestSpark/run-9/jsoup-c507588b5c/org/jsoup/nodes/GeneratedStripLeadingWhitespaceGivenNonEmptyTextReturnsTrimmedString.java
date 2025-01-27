package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespaceGivenNonEmptyTextReturnsTrimmedString {

    @Test
    public void stripLeadingWhitespaceGivenNonEmptyTextReturnsTrimmedString() {
        String text = "   Hello, World!";
        String result = StringUtil.stripLeadingWhitespace(text);
        assertEquals("Hello, World!", result);
    }

}