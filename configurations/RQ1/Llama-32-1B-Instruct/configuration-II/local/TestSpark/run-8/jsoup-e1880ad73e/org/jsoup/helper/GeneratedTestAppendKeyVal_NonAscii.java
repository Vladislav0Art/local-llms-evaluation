package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_NonAscii {

    @Test
    public void testAppendKeyVal_NonAscii() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder("http://example.com/path?query=a%3D1");
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assertEquals("http://example.com/path?query=a%3D1", builder.build().toString());
    }

}