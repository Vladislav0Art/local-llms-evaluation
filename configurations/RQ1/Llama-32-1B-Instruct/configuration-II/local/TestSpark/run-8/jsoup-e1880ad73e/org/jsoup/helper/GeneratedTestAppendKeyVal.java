package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path?a=1&b=2");
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assertEquals("http://example.com/path?a%3D1&b%3D2", builder.build().toString());
    }

}