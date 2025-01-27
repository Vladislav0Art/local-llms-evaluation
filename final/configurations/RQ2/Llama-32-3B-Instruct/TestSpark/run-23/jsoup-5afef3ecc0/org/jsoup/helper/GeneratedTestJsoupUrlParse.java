package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestJsoupUrlParse {

    private String scheme;
    private String authority;
    private String path;
    private String query;
    private String fragment;

    public UrlBuilder(String scheme, String authority, String path) {
        this.scheme = scheme;
        this.authority = authority;
        this.path = path;
    }

    public String toString() {
        return scheme + "://" + authority + path + "?" + query + "#" + fragment;
    }
}

public class GeneratedTest {

    @Test
    public void testJsoupUrlParse() throws Exception {
        // Create a new Jsoup document
        Document document = Jsoup.connect("https://example.com/test/path?param1=value1&param2=value2").get();

        // Assert that the URL is parsed correctly
        assertEquals("https://example.com", document.url());
    }

}