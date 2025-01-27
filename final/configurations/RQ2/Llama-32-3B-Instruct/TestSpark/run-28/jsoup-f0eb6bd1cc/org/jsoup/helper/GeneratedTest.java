package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void constructorNoInputUrl() {
        UrlBuilder urlBuilder = new UrlBuilder();
        assertNull(urlBuilder.getInputUrl());
    }

    @Test
    public void buildUrl() throws MalformedURLException, URISyntaxException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        String expected = "http://example.com";
        assertEquals(expected, StringUtil.normalizeString(StringUtil.encodeToUTF8(urlBuilder.build().toString())));
    }

    @Test
    public void appendKeyValNoKey() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal(null, "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        String expected = "http://example.com?value=value";
        assertEquals(expected, StringUtil.normalizeString(StringUtil.encodeToUTF8(urlBuilder.appendKeyVal(kv).toString())));
    }

    @Test
    public void appendKeyValWithKeyAndValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        String expected = "http://example.com?key=value";
        assertEquals(expected, StringUtil.normalizeString(StringUtil.encodeToUTF8(urlBuilder.appendKeyVal(kv).toString())));
    }

    @Test
    public void appendKeyValWithNullValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", null);
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        String expected = "http://example.com?key=&value=value";
        assertEquals(expected, StringUtil.normalizeString(StringUtil.encodeToUTF8(urlBuilder.appendKeyVal(kv).toString())));
    }

    @Test
    public void appendKeyValWithNullKeyAndValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal(null, null);
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        String expected = "http://example.com?&value=value";
        assertEquals(expected, StringUtil.normalizeString(StringUtil.encodeToUTF8(urlBuilder.appendKeyVal(kv).toString())));
    }

}