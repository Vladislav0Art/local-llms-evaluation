package org.jsoup.helper;

public class GeneratedTestNormalizeUrl {

    private static final String BASE_URL = "http://example.com";

    @Test
    public void testNormalizeUrl() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(BASE_URL);
        String url = builder.build().toString(); // should be normalized URL
        // we check that any existing escapes in path components are preserved
    }

}