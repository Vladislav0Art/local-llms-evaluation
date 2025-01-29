package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTest_parseFragment_emptyString {

    @Test
    public void test_parseFragment_emptyString() {
        Document doc = Jsoup.parse("");
        String fragment = "foo";
        assertTrue(Utils.parseFragment(fragment, null));
    }

}