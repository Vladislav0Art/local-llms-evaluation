package org.jsoup.helper;

public class GeneratedAppendKeyValTest_WithValidKeyValPairs {

    @Test
    public void appendKeyValTest_WithValidKeyValPairs() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        urlBuilder.appendKeyVal(kv);
        assertEquals(2, urlBuilder.build().getProtocol().length());
    }

}