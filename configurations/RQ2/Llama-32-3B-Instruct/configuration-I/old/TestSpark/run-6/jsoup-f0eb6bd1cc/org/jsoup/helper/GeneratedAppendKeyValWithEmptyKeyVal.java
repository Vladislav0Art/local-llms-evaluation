package org.jsoup.helper;

public class GeneratedAppendKeyValWithEmptyKeyVal {

    @Test
    public void appendKeyValWithEmptyKeyVal() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(Connection.KeyVal.newKeyVal(""));
        assertEquals(new URL("http://example.com?"), urlBuilder.build(), new URL("http://example.com?"));
    }

}