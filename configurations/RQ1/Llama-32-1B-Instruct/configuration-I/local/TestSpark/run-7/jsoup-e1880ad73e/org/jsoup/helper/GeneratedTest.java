package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testUrlBuilder_ConnectsToRemoteUrl() {
        URL remoteUrl = "https://example.com/path?a=1&b=2";
        URL actualUrl = new UrlBuilder(remoteUrl).build();
        assertSame(remoteUrl, actualUrl);
    }

    @Test
    public void testAppendKeyVal_FixesEmptyMap() {
        Connection.KeyVal kv = new Connection.KeyVal();
        kv.set("key", "value");
        String encodedKey = URLDecoder.decode(kv.key(), UTF_8.name());
        String encodedValue = URLDecoder.decode(kv.value(), UTF_8.name());
        UrlBuilderTest.appendKeyVal(kv);
        assertSame(encodedKey, new StringBuilder().append("=").append(encodedValue).toString());
    }

    @Test
    public void testAppendKeyVal_EmptyMap() {
        Connection.KeyVal kv = new Connection.KeyVal();
        String encodedKey = URLDecoder.decode(kv.key(), UTF_8.name());
        String encodedValue = URLDecoder.decode(kv.value(), UTF_8.name());
        UrlBuilderTest.appendKeyVal(null);
        assertSame(encodedKey, new StringBuilder().append("=").append(encodedValue).toString());
    }

    @Test
    public void testAppendKeyVal_NonAsciiEscapes() {
        Connection.KeyVal kv = new Connection.KeyVal();
        kv.set("key", "non-ascii value");
        String encodedKey = URLDecoder.decode(kv.key(), UTF_8.name());
        String encodedValue = URLDecoder.decode(kv.value(), UTF_8.name());
        UrlBuilderTest.appendKeyVal(kv);
        assertSame(encodedKey, new StringBuilder().append("=").append(encodedValue).toString());
    }

    @Test
    public void testAppendKeyVal_NonAsciiEscapesWithExistingEscapes() {
        Connection.KeyVal kv = new Connection.KeyVal();
        kv.set("key", "non-ascii value with existing escape");
        String encodedKey = URLDecoder.decode(kv.key(), UTF_8.name());
        String encodedValue = URLDecoder.decode(kv.value(), UTF_8.name());
        UrlBuilderTest.appendKeyVal(kv);
        assertSame(encodedKey, new StringBuilder().append("=").append(encodedValue).toString());
    }

    @Test
    public void testAppendUrlWithoutQuery() {
        String query = "foo=bar";
        String actualUrl = new UrlBuilder(new URL("https://example.com/path")).build();
        assertSame(URI.class, actualUrl.getProtocol());
        assertNotSame(query, null);
    }

    @Test
    public void testAppendUrlWithFragment() {
        String fragment = "baz=qux";
        String actualUrl = new UrlBuilder(new URL("https://example.com/path?foo=bar#frag")).build();
        assertSame(URI.class, actualUrl.getProtocol());
        assertNotSame(fragment, null);
    }

    @Test
    public void testAppendUrlWithRef() {
        String ref = "quux";
        String actualUrl = new UrlBuilder(new URL("https://example.com/path?foo=bar#frag")).build();
        assertSame(URI.class, actualUrl.getProtocol());
        assertNotSame(ref, null);
    }

}