package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestParseFragment {

    @Test
    public void testParseFragment() {
        Document doc = Jsoup.parse("http://example.com");
        String fragment = "foo";
        assertTrue(Utils.parseFragment(fragment, null));
    }

}