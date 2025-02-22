package org.jsoup.helper;

public class GeneratedAppendKeyVal_shouldAppendToExistingQuery {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws Exception {
        urlBuilder = new UrlBuilder(new URL("http://example.com"));
    }

    @Test
    public void appendKeyVal_shouldAppendToExistingQuery() throws Exception {
        urlBuilder.q = new StringBuilder("a=b");
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");

        urlBuilder.appendKeyVal(kv);

        assertEquals("http://example.com?a=b&key=value", urlBuilder.build().toString());
    }

}