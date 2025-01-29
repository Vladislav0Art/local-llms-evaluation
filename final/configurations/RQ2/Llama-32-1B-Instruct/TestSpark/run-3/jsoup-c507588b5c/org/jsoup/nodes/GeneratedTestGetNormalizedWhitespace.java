package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestGetNormalizedWhitespace {

    private String str;

    @Test
    public void testGetNormalizedWhitespace() {
        String str = "  Hello World! ";
        assertEquals("Hello World", str.normalizeWhitespace());
    }

}