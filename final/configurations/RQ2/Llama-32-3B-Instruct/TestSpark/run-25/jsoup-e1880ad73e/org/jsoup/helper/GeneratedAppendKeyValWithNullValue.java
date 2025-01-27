package org.jsoup.helper;

public class GeneratedAppendKeyValWithNullValue {

    private UrlBuilder urlBuilder;

    @Test
    public void appendKeyValWithNullValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = Connection.KeyVal.of("key", null);
        urlBuilder.appendKeyVal(kv);
    }

}