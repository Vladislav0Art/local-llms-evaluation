package org.jsoup.helper;

public class GeneratedAppendKeyVal_addsQueryParameter_toStringBuilder {

    @Test
    public void appendKeyVal_addsQueryParameter_toStringBuilder() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(kv);
        assertEquals("?key=value", String.valueOf(builder.q));
    }

}