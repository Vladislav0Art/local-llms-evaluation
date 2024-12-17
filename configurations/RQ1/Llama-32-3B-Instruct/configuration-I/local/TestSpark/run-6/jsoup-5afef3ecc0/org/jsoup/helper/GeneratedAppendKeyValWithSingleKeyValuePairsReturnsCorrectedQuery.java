package org.jsoup.helper;

public class GeneratedAppendKeyValWithSingleKeyValuePairsReturnsCorrectedQuery {

    @Test
    public void appendKeyValWithSingleKeyValuePairsReturnsCorrectedQuery() {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path"));
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        assertEquals("?key1=value1&key2=value2", builder.q.toString());
    }

}