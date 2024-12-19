package org.jsoup.helper;

public class GeneratedAppendKeyValWithValidKeyValuePairs {

    private UrlBuilder urlBuilder;

    @Test
    public void appendKeyValWithValidKeyValuePairs() throws UnsupportedEncodingException {
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        urlBuilder.appendKeyVal(kv1);
        assertNotNull(urlBuilder.q);
        assertTrue(urlBuilder.q.toString().contains("key1=value1"));
    }

}