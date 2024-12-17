package org.jsoup.helper;

public class GeneratedAppendKeyVal {

    @Test
    public void appendKeyVal() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(kv);
        assertEquals("?key=value", builder.q.toString());
    }

}