package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestParseFragmentNoBaseUri {

    @Test
    public void testParseFragmentNoBaseUri() {
        Document doc = Jsoup.parse("");
        String fragment = "";
        assertTrue(Utils.parseFragment(fragment, null));
    }

}