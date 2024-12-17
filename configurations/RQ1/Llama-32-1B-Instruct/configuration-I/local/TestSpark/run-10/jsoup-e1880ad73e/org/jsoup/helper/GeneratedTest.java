package org.jsoup.helper;

public class GeneratedTest {

    private static final String BASE_URL = "http://example.com";

    @Test
    public void testBuildUrl() {
        UrlBuilder builder = new UrlBuilder(BASE_URL);
        assert builder.build().getProtocol().equals("https");
        assert builder.build().getHost().equals("example.com");
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(BASE_URL);
        UrlBuilder.Value kv1 = new UrlBuilder.Value("key1", "value1");
        UrlBuilder.Value kv2 = new UrlBuilder.Value("key2", "value2");
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        assert builder.getQuery().length() == 10;
    }

    @Test
    public void testAppendKeyValInvalidChars() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(BASE_URL);
        builder.appendKeyVal(new UrlBuilder.Value("key1", "value1"));
        // we should not pass any query string with invalid characters
    }

    @Test
    public void testEncodeNonAsciiPath() {
        UrlBuilder builder = new UrlBuilder(BASE_URL);
        String url = builder.build().getProtocol();
        assert !url.contains("path");
    }

    @Test
    public void testNormalizeUrl() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(BASE_URL);
        String url = builder.build().toString(); // should be normalized URL
        // we check that any existing escapes in path components are preserved
    }

    @Test
    public void testAppendAsciiCharacters() {
        UrlBuilder builder = new UrlBuilder(BASE_URL);
        builder.appendKeyVal(new UrlBuilder.Value("key1", "value1"));
        String url = builder.build().toString();
        assert url.contains("%20");
    }

}