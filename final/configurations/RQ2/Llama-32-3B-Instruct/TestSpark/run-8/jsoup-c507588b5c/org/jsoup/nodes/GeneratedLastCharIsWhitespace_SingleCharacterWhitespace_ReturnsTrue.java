package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespace_SingleCharacterWhitespace_ReturnsTrue {

    @Test
    public void lastCharIsWhitespace_SingleCharacterWhitespace_ReturnsTrue() {
        StringBuilder sb = mock(StringBuilder.class);
        when(sb.toString()).thenReturn(" ");
        assertTrue(lastCharIsWhitespace(sb));
    }

}