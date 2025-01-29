package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithNullAndEmptyString {

    @Test
    public void testAppendKeyValWithNullAndEmptyString() throws UnsupportedEncodingException {
        Connection.KeyVal kv = null;

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertTrue(urlBuilder.getKeys().containsValue(null));
    }

}