package org.jsoup.helper;

public class GeneratedTestNormalizeEncoding {

    @Test
    public void testNormalizeEncoding() throws UnsupportedEncodingException {
        URLBuilder builder = new UrlBuilder("https://example.com?query=value&charset=utf-8");
        builder.appendKeyVal(new KeyVal("key", "value"));
        String normalizedUrl = builder.build();
        assert !normalizedUrl.startsWith("http:");
    }

}