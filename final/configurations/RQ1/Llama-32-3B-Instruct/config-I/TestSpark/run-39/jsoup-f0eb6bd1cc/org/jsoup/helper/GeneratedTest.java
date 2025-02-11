package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void ofUrlBuildsCorrectlyTest() {
        URL u = new URL("https://example.com?query=abc&ref=def");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals(new URL("https://example.com?query=abc%26def#"), builder.build());
    }

    @Test
    public void ofUrlWithQueryAndFragmentBuildsCorrectlyTest() {
        URL u = new URL("https://example.com?query=abc&ref=def#frag");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals(new URL("https://example.com?query=abc%26def#frag"), builder.build());
    }

    @Test
    public void ofUrlWithQueryAndFragmentButNoRefBuildsCorrectlyTest() {
        URL u = new URL("https://example.com?query=abc&ref=def");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals(new URL("https://example.com?query=abc%26def"), builder.build());
    }

    @Test
    public void ofUrlBuildsCorrectlyWithNonAsciiPath() {
        URL u = new URL("https://example.com?path=%C3%A9cole&ref=def");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals(new URL("https://example.com?path=%C3%A9cole%26def"), builder.build());
    }

    @Test
    public void ofUrlBuildsCorrectlyWithNonAsciiQuery() {
        URL u = new URL("https://example.com?query=abc%C3%B6");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals(new URL("https://example.com?query=abc%26oe"), builder.build());
    }

    @Test
    public void ofUrlBuildsCorrectlyWithNonAsciiFragment() {
        URL u = new URL("https://example.com?path=%C3%A9cole&ref=%C3%B6def");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals(new URL("https://example.com?path=%C3%A9cole%26oe#%C3%B6def"), builder.build());
    }

    @Test
    public void ofUrlBuildsCorrectlyWithNonAsciiQueryAndFragment() {
        URL u = new URL("https://example.com?query=abc%C3%B6&ref=%C3%B6def");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals(new URL("https://example.com?query=abc%26oe#%C3%B6def"), builder.build());
    }

    @Test
    public void buildThrowsMalformedURLExceptionIfInputIsInvalid() {
        try {
            new UrlBuilder(null);
            assert false;
        } catch (MalformedURLException e) {
            // expected
        }
    }

    @Test
    public void buildThrowsURISyntaxExceptionIfInputUriIsInvalid() {
        try {
            URL u = new URL("invalid://example.com?query=abc");
            new UrlBuilder(u);
            assert false;
        } catch (URISyntaxException e) {
            // expected
        }
    }

    @Test
    public void appendKeyValAddsKeyValToUrlTest() {
        Connection.KeyVal kv1 = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        builder.appendKeyVal(kv1);
        assertEquals(0, builder.q.toString().split("&").length - 1);
    }

    @Test
    public void appendKeyValAddsMultipleKeyValsToUrlTest() {
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        assertEquals(0, builder.q.toString().split("&").length - 2);
    }

    @Test
    public void decodePartDoesNotThrowUnsupportedEncodingException() {
        assertEquals("test", UrlBuilder.decodePart("test").toString());
    }

}