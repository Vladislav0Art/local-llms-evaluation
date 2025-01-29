package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithNull {

    @Test
    public void testAppendKeyValWithNull() throws UnsupportedEncodingException {
        Connection.KeyVal kv = null;

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertTrue(urlBuilder.getKeys().containsKey(null));
    }

}