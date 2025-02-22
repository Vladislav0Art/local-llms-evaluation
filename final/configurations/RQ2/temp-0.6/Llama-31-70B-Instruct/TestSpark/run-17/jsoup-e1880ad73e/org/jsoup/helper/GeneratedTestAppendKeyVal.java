package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws Exception {
        URL inputUrl = new URL("http://example.com");
        urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(kv);
        assertEquals("key=value", urlBuilder.q.toString());
    }

}