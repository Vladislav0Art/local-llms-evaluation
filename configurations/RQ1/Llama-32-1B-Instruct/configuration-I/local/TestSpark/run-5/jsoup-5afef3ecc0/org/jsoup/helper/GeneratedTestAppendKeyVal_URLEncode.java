package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_URLEncode {

    @Test
    public void testAppendKeyVal_URLEncode() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path?param1=value1&param2=+value2");
        builder.appendKeyVal(new org.jsoup.KeyVal("key", "value"));
        assertSame(builder.build(), "http%3A//example.com/path%23param1=value1%26param2%3D%26");
    }

}