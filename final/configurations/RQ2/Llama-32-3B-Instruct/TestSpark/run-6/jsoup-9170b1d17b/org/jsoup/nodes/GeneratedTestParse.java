package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestParse {

    @Test
    public void testParse() throws IOException {
        Document doc = Jsoup.parse("<a>value</a><b>value</b>");
        assertNotNull(doc);
    }

}