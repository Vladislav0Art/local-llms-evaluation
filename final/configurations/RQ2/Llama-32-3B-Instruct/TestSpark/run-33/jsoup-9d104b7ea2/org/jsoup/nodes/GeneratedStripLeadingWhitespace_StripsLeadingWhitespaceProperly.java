package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_StripsLeadingWhitespaceProperly {

    @Test
    public void stripLeadingWhitespace_StripsLeadingWhitespaceProperly() {
        String text = "  Hello, World!";
        String expectedOutput = "Hello, World!";
        assertEquals(expectedOutput, StringUtil.stripLeadingWhitespace(text));
    }

}