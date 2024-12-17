package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_KV_WithEmptyPath {

    private String url;
    private UrlBuilder builder;

    @Test
    public void testAppendKeyVal_KV_WithEmptyPath() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/?");
        builder = new UrlBuilder(inputUrl);
        String query = builder.appendKeyVal(new KeyVal("key", "Kä").setPath(""));
        assertEquals("http://example.com/?key%3DK%C3%A4", inputUrl.getQuery());
    }

}