package org.jsoup.helper;

public class GeneratedTestAppendKeyValInvalidChars {

    private static final String BASE_URL = "http://example.com";

    @Test
    public void testAppendKeyValInvalidChars() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(BASE_URL);
        builder.appendKeyVal(new UrlBuilder.Value("key1", "value1"));
        // we should not pass any query string with invalid characters
    }

}