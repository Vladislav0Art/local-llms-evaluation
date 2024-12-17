package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path?param1=value1&param2=value2");
        builder.appendKeyVal(new org.jsoup.KeyVal("key", "value"));
        assertSame(builder.build(), "http://example.com/path?param1=value1%26param2=%26value2");
    }

}