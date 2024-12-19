package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithEmptyQuery {

    private final UrlBuilder urlBuilder = new UrlBuilder(null);

    @Test
    public void testAppendKeyValWithEmptyQuery() {
        URL inputUrl = new URL("https://example.com/path/to/resource?query=");
        urlBuilder = u = inputUrl;
        try {
            urlBuilder.appendKeyVal(null);
            fail("Expected an exception was not thrown");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}