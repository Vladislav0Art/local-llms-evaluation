package org.jsoup.helper;

public class GeneratedAppendKeyVal_toExistingQ_appendsKeyAndValue {

    @Test
    public void appendKeyVal_toExistingQ_appendsKeyAndValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com?query=string"));
        builder.appendKeyVal(kv);
        assertTrue(builder.q != null && builder.q.toString().equals("key=value&query=string"));
    }

}