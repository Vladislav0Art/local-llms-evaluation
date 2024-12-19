package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_MalformedKeyValue {

    @Test
    public void testAppendKeyVal_MalformedKeyValue() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(new org.jsoup.KeyVal().key("foo", "bar").value("baz"));
        assertEquals("http://example.com?foo=bar&baz", urlBuilder.build().toString());
    }

}