package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_SimpleText_ReturnsWithTrailingSpaces {

    @Test
    public void stripLeadingWhitespace_SimpleText_ReturnsWithTrailingSpaces() {
        StringBuilder sb = mock(StringBuilder.class);
        when(sb.toString()).thenReturn("Hello ");
        when(StringUtil.stripLeadingWhitespace(anyString())).thenReturn(" Hello");
        String text = "Hello ";
        assertEquals(" Hello", StringUtil.stripLeadingWhitespace(text));
    }

}