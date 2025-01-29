package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestGetLastCharIsWhitespace {

    private String str;

    @Test
    public void testGetLastCharIsWhitespace() {
        char[] chars = {'a', 'b'};
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }
        String str = sb.toString();
        assertTrue(str.startsWith("abc"));
    }

}