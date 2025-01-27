package org.jsoup.nodes;

public class GeneratedNormaliseWhitespace_SimpleText_ReturnsWithSpaces {

    @Test
    public void normaliseWhitespace_SimpleText_ReturnsWithSpaces() {
        StringBuilder sb = mock(StringBuilder.class);
        when(sb.toString()).thenReturn("");
        when(StringUtil.normaliseWhitespace(anyString())).thenReturn(" ");
        String text = "Hello";
        assertEquals(" Hello ", StringUtil.normaliseWhitespace(text));
    }

}