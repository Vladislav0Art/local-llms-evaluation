package org.jsoup.helper;

public class GeneratedAppendKeyValWithMultipleKeyValuePairs {

    private UrlBuilder urlBuilder;

    @Test
    public void appendKeyValWithMultipleKeyValuePairs() throws UnsupportedEncodingException {
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);
        assertNotNull(urlBuilder.q);
        assertTrue(urlBuilder.q.toString().contains("key1=value1&key2=value2"));
    }

}