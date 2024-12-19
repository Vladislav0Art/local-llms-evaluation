package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithInvalidKey {

    private final UrlBuilder urlBuilder = new UrlBuilder(null);

    @Test
    public void testAppendKeyValWithInvalidKey() {
        URL inputUrl = new URL("https://example.com/path/to/resource");
        try {
            urlBuilder.appendKeyVal(null);
            fail("Expected an exception was not thrown");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}