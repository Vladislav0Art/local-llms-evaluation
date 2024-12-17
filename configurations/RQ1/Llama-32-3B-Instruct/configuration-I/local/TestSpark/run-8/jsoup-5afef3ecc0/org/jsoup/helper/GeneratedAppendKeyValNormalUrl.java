package org.jsoup.helper;

public class GeneratedAppendKeyValNormalUrl {

    @Test
    public void appendKeyValNormalUrl() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://test.com"));
        builder.appendKeyVal(kv);
        assertEquals("http://test.com?key=value", builder.build().toString());
    }

}