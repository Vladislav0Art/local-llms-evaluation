package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_SingleValue {

    @Test
    public void testAppendKeyVal_SingleValue() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(new org.jsoup.KeyVal().key("foo", "bar"));
        assertEquals("http://example.com?foo=bar", urlBuilder.build().toString());
    }

}