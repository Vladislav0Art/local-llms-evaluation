package org.jsoup.helper;

public class GeneratedTestNormalizeFragment {

    @Test
    public void testNormalizeFragment() throws UnsupportedEncodingException {
        URLBuilder builder = new UrlBuilder("https://example.com/path/to/resource#anchor");
        builder.appendKeyVal(new KeyVal("key", "value"));
        String normalizedUrl = builder.build();
        assert !normalizedUrl.startsWith("http:");
    }

}