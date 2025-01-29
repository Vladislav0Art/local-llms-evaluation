package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithEmptyString {

    @Test
    public void testAppendKeyValWithEmptyString() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("", "");

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertEquals(1, urlBuilder.getKeys().size());
    }

}