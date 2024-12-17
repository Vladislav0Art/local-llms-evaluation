package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_NegativeRef {

    @Test
    public void testAppendKeyVal_NegativeRef() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path#ref=1234567890");
        builder.appendKeyVal(new org.jsoup.KeyVal("key", "value"));
        assertSame(builder.build(), "http://example.com/path?ref=1234567890%26param1=value1&param2=value2");
    }

}