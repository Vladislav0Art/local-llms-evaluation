package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_NoLeadingWhitespaces_ReturnsOriginalText {

    @Test
    public void stripLeadingWhitespace_NoLeadingWhitespaces_ReturnsOriginalText() {
        StringBuilder sb = mock(StringBuilder.class);
        when(sb.toString()).thenReturn("");
        when(StringUtil.stripLeadingWhitespace(anyString())).thenReturn("");
        String text = "";
        assertEquals("", StringUtil.stripLeadingWhitespace(text));
    }

}