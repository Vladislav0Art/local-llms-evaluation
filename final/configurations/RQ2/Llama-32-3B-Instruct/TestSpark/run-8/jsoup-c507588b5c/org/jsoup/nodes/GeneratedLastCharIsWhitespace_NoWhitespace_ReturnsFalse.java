package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespace_NoWhitespace_ReturnsFalse {

    @Test
    public void lastCharIsWhitespace_NoWhitespace_ReturnsFalse() {
        StringBuilder sb = mock(StringBuilder.class);
        when(sb.toString()).thenReturn("");
        assertFalse(lastCharIsWhitespace(sb));
    }

}