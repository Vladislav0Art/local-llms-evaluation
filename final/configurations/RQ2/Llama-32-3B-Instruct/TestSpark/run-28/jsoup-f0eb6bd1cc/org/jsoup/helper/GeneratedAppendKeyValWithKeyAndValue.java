package org.jsoup.helper;

public class GeneratedAppendKeyValWithKeyAndValue {

    @Test
    public void appendKeyValWithKeyAndValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        String expected = "http://example.com?key=value";
        assertEquals(expected, StringUtil.normalizeString(StringUtil.encodeToUTF8(urlBuilder.appendKeyVal(kv).toString())));
    }

}