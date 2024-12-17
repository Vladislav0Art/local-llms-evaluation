package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_InvalidRef {

    @Test
    public void testAppendKeyVal_InvalidRef() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path?param1=value1&ref=abc");
        try {
            builder.appendKeyVal(new org.jsoup.KeyVal("key", "value"));
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}