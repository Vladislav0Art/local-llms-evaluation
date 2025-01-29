package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTest {

    @Test
    public void testParseFragment() {
        Document doc = Jsoup.parse("http://example.com");
        String fragment = "foo";
        assertTrue(Utils.parseFragment(fragment, null));
    }

    @Test
    public void testParseFragmentNoBaseUri() {
        Document doc = Jsoup.parse("");
        String fragment = "";
        assertTrue(Utils.parseFragment(fragment, null));
    }

    @Test
    public void test_parseFragment_emptyString() {
        Document doc = Jsoup.parse("");
        String fragment = "foo";
        assertTrue(Utils.parseFragment(fragment, null));
    }

    @Test
    public void testParseFragment_nullBaseUri() {
        Document doc = Jsoup.parse("http://example.com");
        String fragment = null;
        assertTrue(Utils.parseFragment(fragment, null, new Object()));
    }

    @Test
    public void test_parseFragment_noTextContent() {
        Document doc = Jsoup.parse("http://example.com");
        String fragment = "foo";
        assertTrue(Utils.parseFragment(fragment, null, new Object()));
    }
}

class Utils {

    public static boolean parseFragment(String textContent, String baseUri, Object additionalInfo) {
        if (textContent == null || baseUri == null) {
            throw new IllegalArgumentException("Text content and base URI cannot be null");
        }

        return Jsoup.parse(textContent).text().contains(baseUri);
    }

}