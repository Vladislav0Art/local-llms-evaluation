package org.jsoup.helper;

public class GeneratedAppendKeyValWithInvalidCharWorks {

    @Test
    public void appendKeyValWithInvalidCharWorks() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key with !", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        assertEquals(4, StringUtil.length(kv.getKey()));
    }

}