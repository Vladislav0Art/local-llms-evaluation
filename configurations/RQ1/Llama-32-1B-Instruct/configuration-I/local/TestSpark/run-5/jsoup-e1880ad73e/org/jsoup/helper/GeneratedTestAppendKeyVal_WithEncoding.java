package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_WithEncoding {

    @Test
    public void testAppendKeyVal_WithEncoding() {
        URLBuilder builder = new UrlBuilder("https://example.com?query=value&charset=utf-8");
        builder.appendKeyVal(new KeyVal("key", "value"));
        assert !builder.u.getRef().equals(null);
        assert !builder.q.toString().isEmpty();
    }

}