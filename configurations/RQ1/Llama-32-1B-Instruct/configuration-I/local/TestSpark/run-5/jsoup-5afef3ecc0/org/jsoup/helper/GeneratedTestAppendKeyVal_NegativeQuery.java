package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_NegativeQuery {

    @Test
    public void testAppendKeyVal_NegativeQuery() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path?param1=value1&%3Dref");
        try {
            builder.appendKeyVal(new org.jsoup.KeyVal("key", "value"));
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}