package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithEmptyValue {

    private final UrlBuilder urlBuilder = new UrlBuilder(null);

    @Test
    public void testAppendKeyValWithEmptyValue() {
        URL inputUrl = new URL("https://example.com/path/to/resource");
        urlBuilder = u = inputUrl;
        try {
            urlBuilder.appendKeyVal(new Connection.KeyVal("", "test-value"));
            fail("Expected an exception was not thrown");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}