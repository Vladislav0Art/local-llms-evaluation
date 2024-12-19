package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithEmptyFragment {

    private final UrlBuilder urlBuilder = new UrlBuilder(null);

    @Test
    public void testAppendKeyValWithEmptyFragment() {
        URL inputUrl = new URL("https://example.com/path/to/resource#fragment=");
        urlBuilder = u = inputUrl;
        try {
            urlBuilder.appendKeyVal(null);
            fail("Expected an exception was not thrown");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}