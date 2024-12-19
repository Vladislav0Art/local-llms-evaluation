package org.jsoup.helper;

public class GeneratedTestUrlBuilder {

    private static final String URL_PATH = "path/to/test/url";

    @Test
    public void testUrlBuilder() {
        UrlBuilder urlBuilder = new UrlBuilder(new URI("http://example.com/path/to/test/url"));
        assertEquals("https://example.com/path%2Fto%20test%2Furl", urlBuilder.build().toString());
    }

}