package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithInvalidValue {

    private final UrlBuilder urlBuilder = new UrlBuilder(null);

    @Test
    public void testAppendKeyValWithInvalidValue() {
        URL inputUrl = new URL("https://example.com/path/to/resource");
        urlBuilder = u = inputUrl;
        try {
            urlBuilder.appendKeyVal(new Connection.KeyVal("test", "invalid-value"));
            fail("Expected an exception was not thrown");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}