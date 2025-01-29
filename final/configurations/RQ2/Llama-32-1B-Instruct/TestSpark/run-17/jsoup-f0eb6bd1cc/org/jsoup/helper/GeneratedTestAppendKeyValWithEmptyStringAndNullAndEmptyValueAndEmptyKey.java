package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithEmptyStringAndNullAndEmptyValueAndEmptyKey {

    @Test
    public void testAppendKeyValWithEmptyStringAndNullAndEmptyValueAndEmptyKey() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("", "");

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertTrue(urlBuilder.getKeys().containsValue(null));
    }

}