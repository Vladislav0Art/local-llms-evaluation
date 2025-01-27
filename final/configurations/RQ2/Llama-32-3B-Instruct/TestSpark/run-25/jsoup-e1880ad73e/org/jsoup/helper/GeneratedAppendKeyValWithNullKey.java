package org.jsoup.helper;

public class GeneratedAppendKeyValWithNullKey {

    private UrlBuilder urlBuilder;

    @Test
    public void appendKeyValWithNullKey() throws UnsupportedEncodingException {
        Connection.KeyVal kv = Connection.KeyVal.of(null, "val");
        urlBuilder.appendKeyVal(kv);
    }

}