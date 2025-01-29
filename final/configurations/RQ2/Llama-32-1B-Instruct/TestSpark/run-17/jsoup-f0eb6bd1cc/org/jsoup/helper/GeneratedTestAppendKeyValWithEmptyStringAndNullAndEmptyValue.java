package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithEmptyStringAndNullAndEmptyValue {

    @Test
    public void testAppendKeyValWithEmptyStringAndNullAndEmptyValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("", "");

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertTrue(urlBuilder.getKeys().containsValue(null));
    }

}