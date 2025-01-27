package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestJsoupUrl {

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
    public void testJsoupUrl() throws Exception {
        // Create a new Jsoup document
        Document document = Jsoup.connect("https://example.com").get();

        // Assert that the title of the page is correct
        assertEquals("", document.title());

        // Find all elements with class "jsoup-test"
        Elements elements = document.select(".jsoup-test");
    }

}