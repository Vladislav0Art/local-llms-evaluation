package org.jsoup.helper;

public class GeneratedTest {

    private static final String SIMPLE_URL = "https://example.com/path?query=value";

    @Test
    public void testBuild() throws Exception {
        URL u = new URL(SIMPLE_URL);
        UrlBuilder builder = new UrlBuilder(u);
        assert builder.u != null;
        String normUrl = builder.build();
        assertEquals("https://example.com/path", normUrl);
    }

    @Test
    public void testAppendKeyVal() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL(SIMPLE_URL));
        builder.appendKeyVal(Connection.KeyVal.of("key1", "value1"));
        builder.appendKeyVal(Connection.KeyVal.of("key2", "value2"));
        String normUrl = builder.build();
        assertEquals("https://example.com/path?key1=value1&key2=value2#foo&bar=baz", normUrl);
    }

    @Test
    public void testAppendKeyVals() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL(SIMPLE_URL));
        String q = Connection.KeyVal.of("key1", "value1").key().toString();
        builder.appendKeyVal(Connection.KeyVal.of("key2", "value2"));
        builder.appendKeyVal(q);
        String normUrl = builder.build();
        assertEquals("https://example.com/path?key1=value1&key2=value2#foo&bar=baz?query=value", normUrl);
    }

    @Test
    public void testBuildWithNoQuery() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL(SIMPLE_URL));
        String normUrl = builder.build();
        assertEquals("https://example.com/path", normUrl);
    }

    @Test
    public void testAppendKeyValNoRef() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL(SIMPLE_URL));
        builder.appendKeyVal(Connection.KeyVal.of("key1", "value1"));
        String normUrl = builder.build();
        assertEquals("https://example.com/path?key1=value1", normUrl);
    }

    @Test
    public void testBuildWithNoRef() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL(SIMPLE_URL));
        String normUrl = builder.build();
        assertEquals("https://example.com/path", normUrl);
    }

}