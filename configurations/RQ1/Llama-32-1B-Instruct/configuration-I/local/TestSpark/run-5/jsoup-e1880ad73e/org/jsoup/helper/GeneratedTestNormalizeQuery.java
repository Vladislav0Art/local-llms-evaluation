package org.jsoup.helper;

public class GeneratedTestNormalizeQuery {

    @Test
    public void testNormalizeQuery() throws UnsupportedEncodingException {
        URLBuilder builder = new UrlBuilder("https://example.com?query=value");
        builder.appendKeyVal(new KeyVal("key", "value"));
        String normalizedUrl = builder.build();
        assert !normalizedUrl.startsWith("http:");
    }

}