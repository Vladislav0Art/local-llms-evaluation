package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_InvalidQuery {

    @Test
    public void testAppendKeyVal_InvalidQuery() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path?param1=value1");
        try {
            builder.appendKeyVal(new org.jsoup.KeyVal("key", "%20value2"));
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}