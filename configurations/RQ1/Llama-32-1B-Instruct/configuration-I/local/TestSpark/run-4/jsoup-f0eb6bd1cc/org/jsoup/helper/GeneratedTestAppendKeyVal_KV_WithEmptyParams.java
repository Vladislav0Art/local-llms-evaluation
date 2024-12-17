package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_KV_WithEmptyParams {

    private String url;
    private UrlBuilder builder;

    @Test
    public void testAppendKeyVal_KV_WithEmptyParams() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/path?a=1&b=2");
        builder = new UrlBuilder(inputUrl);
        String params = builder.appendKeyVal(new KeyVal("key", "Kä").setPath("/path"));
        assertEquals("http://example.com/path?%3DK%C3%A4&a=1&b=2", inputUrl.getParams());
    }

}