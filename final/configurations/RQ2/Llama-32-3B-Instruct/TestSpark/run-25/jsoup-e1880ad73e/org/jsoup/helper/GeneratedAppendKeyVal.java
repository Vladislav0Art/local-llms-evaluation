package org.jsoup.helper;

public class GeneratedAppendKeyVal {

    private UrlBuilder urlBuilder;

    @Test
    public void appendKeyVal() throws UnsupportedEncodingException {
        Connection.KeyVal kv = Connection.KeyVal.of("key", "val");
        urlBuilder.appendKeyVal(kv);
    }

}