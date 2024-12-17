package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_URLDecode {

    @Test
    public void testAppendKeyVal_URLDecode() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path?param1=value1&param2=%2B");
        builder.appendKeyVal(new org.jsoup.KeyVal("key", "value"));
        assertSame(builder.build(), "http://example.com/path%26param1=value1&param2=%26");
    }

}