package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithEmptyStringAndNull {

    @Test
    public void testAppendKeyValWithEmptyStringAndNull() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("", null);

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertTrue(urlBuilder.getKeys().containsValue(null));
    }

}