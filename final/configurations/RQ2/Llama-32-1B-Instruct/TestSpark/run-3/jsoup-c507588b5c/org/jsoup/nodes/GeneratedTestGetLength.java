package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestGetLength {

    private String str;

    @Test
    public void testGetLength() {
        Document doc = new Document();
        str = "Hello, World!";
        assertEquals(13, str.length());
    }

}