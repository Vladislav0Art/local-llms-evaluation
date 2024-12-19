package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testNormalUrl() {
        URLBuilder urlBuilder = new URLBuilder(new URL("https://example.com/path"));
        assertSame(urlBuilder.u, new URL("https://example.com/path"));
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new URLBuilder(new URL("https://example.com/path"));
        urlBuilder.appendKeyVal(Connection.KeyVal.of("key", "value"));
        assertSame(urlBuilder.u, new URL("https://example.com/path?key=value"));
    }

    @Test
    public void testAppendKeyVals() throws UnsupportedEncodingException {
        URLBuilder urlBuilder = new URLBuilder(new URL("https://example.com/path"));
        String[] kvPairs = {"key1", "value1", "key2", "value2"};
        for (String kv : kvPairs) {
            urlBuilder.appendKeyVal(Connection.KeyVal.of(kv));
        }
        assertSame(urlBuilder.u, new URL("https://example.com/path?key1=value1&key2=value2"));
    }

    @Test
    public void testNormalizeQuery() throws UnsupportedEncodingException {
        String query = "test=query";
        URLBuilder urlBuilder = new URLBuilder(new URL("https://example.com/path"));
        String normalizedQuery = urlBuilder.normalizeQuery(query);
        assertEquals("test%3Dquery", normalizedQuery);
    }

    @Test
    public void testNormalizeRef() throws UnsupportedEncodingException {
        String ref = "test/ref";
        URLBuilder urlBuilder = new URLBuilder(new URL("https://example.com/path"));
        String normalizedRef = urlBuilder.normalizeRef(ref);
        assertEquals("test#ref", normalizedRef);
    }

}