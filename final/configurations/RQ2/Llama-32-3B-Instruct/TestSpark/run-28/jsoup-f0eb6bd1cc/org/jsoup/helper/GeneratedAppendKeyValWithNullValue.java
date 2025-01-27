package org.jsoup.helper;

public class GeneratedAppendKeyValWithNullValue {

    @Test
    public void appendKeyValWithNullValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", null);
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        String expected = "http://example.com?key=&value=value";
        assertEquals(expected, StringUtil.normalizeString(StringUtil.encodeToUTF8(urlBuilder.appendKeyVal(kv).toString())));
    }

}