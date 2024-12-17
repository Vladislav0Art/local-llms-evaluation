package org.jsoup.helper;

public class GeneratedAppendKeyValWithMultipleKeyVals {

    @Test
    public void appendKeyValWithMultipleKeyVals() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv1 = Connection.KeyVal.newKeyVal("key1", "value1");
        Connection.KeyVal kv2 = Connection.KeyVal.newKeyVal("key2", "value2");
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);
        assertEquals(new URL("http://example.com?key1=value1&key2=value2"), urlBuilder.build());
    }

}