package org.jsoup.helper;

public class GeneratedTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws Exception {
        urlBuilder = new UrlBuilder(new URL("http://example.com"));
    }

    @Test
    public void build_shouldReturnPunyCodedHost() throws Exception {
        URL url = urlBuilder.build();

        assertEquals("http://xn--e1afmkfd.xn--p1ai", url.toString());
    }

    @Test
    public void build_shouldReturnNormalizedQuery() throws Exception {
        urlBuilder.q = new StringBuilder("a=b&c=d");

        URL url = urlBuilder.build();

        assertEquals("a=b&c=d", url.getQuery());
    }

    @Test
    public void build_shouldReturnNormalizedRef() throws Exception {
        urlBuilder.u.setRef("test ref");

        URL url = urlBuilder.build();

        assertEquals("%20test%20ref", url.getRef());
    }

    @Test
    public void appendKeyVal_shouldEncodeKeyAndValue() throws Exception {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");

        urlBuilder.appendKeyVal(kv);

        assertEquals("http://example.com?key=value", urlBuilder.build().toString());
    }

    @Test
    public void appendKeyVal_shouldAppendToExistingQuery() throws Exception {
        urlBuilder.q = new StringBuilder("a=b");
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");

        urlBuilder.appendKeyVal(kv);

        assertEquals("http://example.com?a=b&key=value", urlBuilder.build().toString());
    }

}