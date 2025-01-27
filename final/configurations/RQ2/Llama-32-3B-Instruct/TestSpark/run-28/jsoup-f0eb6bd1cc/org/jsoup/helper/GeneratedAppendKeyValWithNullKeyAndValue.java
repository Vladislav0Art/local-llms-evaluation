package org.jsoup.helper;

public class GeneratedAppendKeyValWithNullKeyAndValue {

    @Test
    public void appendKeyValWithNullKeyAndValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal(null, null);
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        String expected = "http://example.com?&value=value";
        assertEquals(expected, StringUtil.normalizeString(StringUtil.encodeToUTF8(urlBuilder.appendKeyVal(kv).toString())));
    }

}