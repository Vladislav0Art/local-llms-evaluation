package org.jsoup.helper;

public class GeneratedOfUrlBuildsCorrectlyWithNonAsciiQuery {

    @Test
    public void ofUrlBuildsCorrectlyWithNonAsciiQuery() {
        URL u = new URL("https://example.com?query=abc%C3%B6");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals(new URL("https://example.com?query=abc%26oe"), builder.build());
    }

}