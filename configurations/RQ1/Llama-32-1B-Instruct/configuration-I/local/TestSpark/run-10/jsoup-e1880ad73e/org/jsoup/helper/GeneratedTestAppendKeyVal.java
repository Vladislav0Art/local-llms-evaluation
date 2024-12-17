package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    private static final String BASE_URL = "http://example.com";

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(BASE_URL);
        UrlBuilder.Value kv1 = new UrlBuilder.Value("key1", "value1");
        UrlBuilder.Value kv2 = new UrlBuilder.Value("key2", "value2");
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        assert builder.getQuery().length() == 10;
    }

}