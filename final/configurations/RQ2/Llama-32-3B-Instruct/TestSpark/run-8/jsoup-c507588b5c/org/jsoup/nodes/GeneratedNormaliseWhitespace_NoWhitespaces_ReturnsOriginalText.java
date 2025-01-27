package org.jsoup.nodes;

public class GeneratedNormaliseWhitespace_NoWhitespaces_ReturnsOriginalText {

    @Test
    public void normaliseWhitespace_NoWhitespaces_ReturnsOriginalText() {
        StringBuilder sb = mock(StringBuilder.class);
        when(sb.toString()).thenReturn("");
        String text = "";
        assertEquals("", StringUtil.normaliseWhitespace(text));
    }

}