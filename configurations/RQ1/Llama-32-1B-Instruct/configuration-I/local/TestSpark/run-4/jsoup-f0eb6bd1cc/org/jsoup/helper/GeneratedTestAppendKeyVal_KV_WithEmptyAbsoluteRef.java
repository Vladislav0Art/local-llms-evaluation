package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_KV_WithEmptyAbsoluteRef {

    private String url;
    private UrlBuilder builder;

    @Test
    public void testAppendKeyVal_KV_WithEmptyAbsoluteRef() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/absolute/path?a=1&b=2#anchor");
        builder = new UrlBuilder(inputUrl);
        String ref = builder.appendKeyVal(new KeyVal("key", "Kä").setPath("/path"));
        assertEquals("http://absolute/path?%3DK%C3%A4#anchor&a=1&b=2", inputUrl.getRef());
    }

}