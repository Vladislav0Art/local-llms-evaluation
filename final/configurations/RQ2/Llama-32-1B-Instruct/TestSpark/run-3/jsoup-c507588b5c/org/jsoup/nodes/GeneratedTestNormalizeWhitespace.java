package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestNormalizeWhitespace {

    private String str;

    @Test
    public void testNormalizeWhitespace() {
        char[] chars = {" ", "\t", "\r"};
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }
        String normalized = sb.toString().trim();
        assertEquals("Hello World", normalized);
    }

}