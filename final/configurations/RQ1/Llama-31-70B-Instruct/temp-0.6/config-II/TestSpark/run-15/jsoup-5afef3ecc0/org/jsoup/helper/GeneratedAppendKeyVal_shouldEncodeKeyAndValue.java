package org.jsoup.helper;

public class GeneratedAppendKeyVal_shouldEncodeKeyAndValue {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws Exception {
        urlBuilder = new UrlBuilder(new URL("http://example.com"));
    }

    @Test
    public void appendKeyVal_shouldEncodeKeyAndValue() throws Exception {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");

        urlBuilder.appendKeyVal(kv);

        assertEquals("http://example.com?key=value", urlBuilder.build().toString());
    }

}