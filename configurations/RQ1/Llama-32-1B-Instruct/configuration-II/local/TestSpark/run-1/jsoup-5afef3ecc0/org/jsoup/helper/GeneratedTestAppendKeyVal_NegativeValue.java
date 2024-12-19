package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_NegativeValue {

    @Test
    public void testAppendKeyVal_NegativeValue() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(new org.jsoup.KeyVal().key("foo", "-1").value("baz"));
        assertEquals("http://example.com?foo=-1&baz", urlBuilder.build().toString());
    }

}