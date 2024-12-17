package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_KV_WithEmptyQuery {

    private String url;
    private UrlBuilder builder;

    @Test
    public void testAppendKeyVal_KV_WithEmptyQuery() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/path?");
        builder = new UrlBuilder(inputUrl);
        String query = builder.appendKeyVal(new KeyVal("key", "Kä").setPath("path"));
        assertEquals("http://example.com/path?key%3DK%C3%A4&path=%C3%80", inputUrl.getQuery());
    }

}