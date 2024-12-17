package org.jsoup.helper;

public class GeneratedTest {

    private String url;
    private UrlBuilder builder;

    @Test
    public void testBuild() {
        URL inputUrl = new URL("http://example.com/path?a=1&b=2#anchor");
        builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        assertEquals("http://example.com/path?a%3D1&b%3D2#anchor", result.getScheme() + "://" + result.getHost());
    }

    @Test
    public void testAppendKeyVal_KV_WithNonAsciiChars() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/path?key=Kä&value=%C3%80");
        builder = new UrlBuilder(inputUrl);
        String query = builder.appendKeyVal(new KeyVal("key", "Kä").setPath("path"));
        assertEquals("http://example.com/path?key%3DK%C3%A4&value%3D%C3%B5", inputUrl.getQuery());
    }

    @Test
    public void testAppendKeyVal_KV_WithEmptyQuery() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/path?");
        builder = new UrlBuilder(inputUrl);
        String query = builder.appendKeyVal(new KeyVal("key", "Kä").setPath("path"));
        assertEquals("http://example.com/path?key%3DK%C3%A4&path=%C3%80", inputUrl.getQuery());
    }

    @Test
    public void testAppendKeyVal_KV_WithEmptyPath() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/?");
        builder = new UrlBuilder(inputUrl);
        String query = builder.appendKeyVal(new KeyVal("key", "Kä").setPath(""));
        assertEquals("http://example.com/?key%3DK%C3%A4", inputUrl.getQuery());
    }

    @Test
    public void testAppendKeyVal_KV_WithEmptyFragment() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/path?a=1&b=2");
        builder = new UrlBuilder(inputUrl);
        String fragment = builder.appendKeyVal(new KeyVal("key", "Kä").setPath("/path"));
        assertEquals("http://example.com/path?%3DK%C3%A4#anchor&a=1&b=2", inputUrl.getFragment());
    }

    @Test
    public void testAppendKeyVal_KV_WithEmptyReference() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/path?a=1&b=2#anchor");
        builder = new UrlBuilder(inputUrl);
        String ref = builder.appendKeyVal(new KeyVal("key", "Kä").setPath("/path"));
        assertEquals("http://example.com/path?%3DK%C3%A4#anchor&a=1&b=2", inputUrl.getRef());
    }

    @Test
    public void testAppendKeyVal_KV_WithEmptyParams() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/path?a=1&b=2");
        builder = new UrlBuilder(inputUrl);
        String params = builder.appendKeyVal(new KeyVal("key", "Kä").setPath("/path"));
        assertEquals("http://example.com/path?%3DK%C3%A4&a=1&b=2", inputUrl.getParams());
    }

    @Test
    public void testAppendKeyVal_KV_WithEmptyAbsoluteRef() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/absolute/path?a=1&b=2#anchor");
        builder = new UrlBuilder(inputUrl);
        String ref = builder.appendKeyVal(new KeyVal("key", "Kä").setPath("/path"));
        assertEquals("http://absolute/path?%3DK%C3%A4#anchor&a=1&b=2", inputUrl.getRef());
    }

}