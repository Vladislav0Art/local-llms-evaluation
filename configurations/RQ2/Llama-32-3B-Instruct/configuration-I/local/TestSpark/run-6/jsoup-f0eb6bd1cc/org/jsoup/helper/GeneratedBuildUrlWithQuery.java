package org.jsoup.helper;

public class GeneratedBuildUrlWithQuery {

    @Test
    public void buildUrlWithQuery() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com?query=value"));
        assertEquals(new URL("http://example.com?query=value"), urlBuilder.build());
    }

}