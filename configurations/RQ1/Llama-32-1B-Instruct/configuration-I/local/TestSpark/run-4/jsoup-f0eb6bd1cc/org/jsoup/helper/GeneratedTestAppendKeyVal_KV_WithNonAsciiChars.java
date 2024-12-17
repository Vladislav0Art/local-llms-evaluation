package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_KV_WithNonAsciiChars {

    private String url;
    private UrlBuilder builder;

    @Test
    public void testAppendKeyVal_KV_WithNonAsciiChars() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/path?key=Kä&value=%C3%80");
        builder = new UrlBuilder(inputUrl);
        String query = builder.appendKeyVal(new KeyVal("key", "Kä").setPath("path"));
        assertEquals("http://example.com/path?key%3DK%C3%A4&value%3D%C3%B5", inputUrl.getQuery());
    }

}