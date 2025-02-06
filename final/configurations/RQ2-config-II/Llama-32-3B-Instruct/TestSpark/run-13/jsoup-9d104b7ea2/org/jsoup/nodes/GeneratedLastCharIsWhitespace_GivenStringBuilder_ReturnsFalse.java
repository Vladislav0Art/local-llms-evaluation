package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespace_GivenStringBuilder_ReturnsFalse {

    @Test
    public void lastCharIsWhitespace_GivenStringBuilder_ReturnsFalse() {
        StringBuilder sb = mock(StringBuilder.class);
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}