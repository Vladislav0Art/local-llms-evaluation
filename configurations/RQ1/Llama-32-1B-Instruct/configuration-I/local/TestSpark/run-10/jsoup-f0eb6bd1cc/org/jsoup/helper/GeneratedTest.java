package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testUrlBuilder_noQuery() {
        String url = "http://example.com";
        URLBuilder builder = new UrlBuilder(url);
        String normUrl = builder.build().toString();
        assertEquals("http://example.com", normUrl);
    }

    @Test
    public void testUrlBuilder_emptyQuery() {
        String url = "http://example.com?test=1&key=value#anchor";
        URLBuilder builder = new UrlBuilder(url);
        String normUrl = builder.build().toString();
        assertEquals("http://example.com", normUrl);
    }

    @Test
    public void testUrlBuilder_emptyQueryAndFragment() {
        String url = "http://example.com?test=1&key=value#anchor";
        URLBuilder builder = new UrlBuilder(url);
        String normUrl = builder.build().toString();
        assertEquals("http://example.com", normUrl);
    }

    @Test
    public void testAppendKeyVal() {
        String key = "value";
        String url = "http://example.com?key=value&other=1#anchor";
        URLBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new org.jsoup.KeyVal().key(key).value("test"));
        assertEquals("http://example.com?value=test", builder.build().toString());
    }

    @Test
    public void testAppendKeyVal_noFragment() {
        String key = "value";
        String url = "http://example.com?key=value&other=1";
        URLBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new org.jsoup.KeyVal().key(key).value("test"));
        assertEquals("http://example.com?value=test", builder.build().toString());
    }

    @Test
    public void testAppendKeyVal_withFragment() {
        String key = "value";
        String url = "http://example.com?key=value#anchor&other=1";
        URLBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new org.jsoup.KeyVal().key(key).value("test"));
        assertEquals("http://example.com?key=value#anchor?test=test", builder.build().toString());
    }

    @Test
    public void testAppendUrlWithoutQuery() {
        String url = "http://example.com";
        URLBuilder builder = new UrlBuilder(url);
        String normUrl = builder.build().toString();
        assertEquals("http://example.com", normUrl);
    }

}