package org.jsoup.helper;

public class GeneratedAppendKeyValTest_WithMultipleKeyValPairs {

    @Test
    public void appendKeyValTest_WithMultipleKeyValPairs() throws UnsupportedEncodingException {
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);
        assertEquals(3, urlBuilder.build().getProtocol().length());
    }

}