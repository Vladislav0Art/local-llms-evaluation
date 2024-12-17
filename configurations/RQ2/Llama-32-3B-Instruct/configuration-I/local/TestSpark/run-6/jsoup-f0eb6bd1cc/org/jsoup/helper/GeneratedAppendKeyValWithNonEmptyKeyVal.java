package org.jsoup.helper;

public class GeneratedAppendKeyValWithNonEmptyKeyVal {

    @Test
    public void appendKeyValWithNonEmptyKeyVal() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = Connection.KeyVal.newKeyVal("key", "value");
        urlBuilder.appendKeyVal(kv);
        assertEquals(new URL("http://example.com?key=value"), urlBuilder.build());
    }

}