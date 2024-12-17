package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_ReplaceEmptyString {

    @Test
    public void testAppendKeyVal_ReplaceEmptyString() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path?param1=value1&param2=");
        builder.appendKeyVal(new org.jsoup.KeyVal("key", "value"));
        assertSame(builder.build(), "http://example.com/path?param1=value1%26param2%3D");
    }

}