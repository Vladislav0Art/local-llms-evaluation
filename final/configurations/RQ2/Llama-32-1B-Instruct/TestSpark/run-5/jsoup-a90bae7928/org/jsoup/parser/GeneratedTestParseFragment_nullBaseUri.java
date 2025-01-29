package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestParseFragment_nullBaseUri {

    @Test
    public void testParseFragment_nullBaseUri() {
        Document doc = Jsoup.parse("http://example.com");
        String fragment = null;
        assertTrue(Utils.parseFragment(fragment, null, new Object()));
    }

}