package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespace_EmptyStringBuilder_ReturnsFalse {

    @Test
    public void lastCharIsWhitespace_EmptyStringBuilder_ReturnsFalse() {
        StringBuilder builder = new StringBuilder();
        boolean expected = false;
        assertTrue(lastCharIsWhitespace(builder));
    }

}