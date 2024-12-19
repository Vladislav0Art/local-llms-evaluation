package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_InvalidValue {

    @Test
    public void testAppendKeyVal_InvalidValue() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        try {
            urlBuilder.appendKeyVal(new org.jsoup.KeyVal().key("foo", "abc"));
        } catch (UnsupportedEncodingException e) {
            // expected exception
        }
    }

}