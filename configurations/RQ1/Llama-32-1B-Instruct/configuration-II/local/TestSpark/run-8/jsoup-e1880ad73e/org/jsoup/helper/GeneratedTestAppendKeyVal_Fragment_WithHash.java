package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_Fragment_WithHash {

    @Test
    public void testAppendKeyVal_Fragment_WithHash() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path?query=a=1&b=c");
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assertEquals("http://example.com/path?a%3D1#b=c", builder.build().toString());
    }

}