package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;

public class GeneratedTestLastCharIsWhitespace {

    @Test
    public void testLastCharIsWhitespace() {
        StringBuilder sb = new StringBuilder();
        lastCharIsWhitespace(sb);
        assertTrue(sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ');
    }

}