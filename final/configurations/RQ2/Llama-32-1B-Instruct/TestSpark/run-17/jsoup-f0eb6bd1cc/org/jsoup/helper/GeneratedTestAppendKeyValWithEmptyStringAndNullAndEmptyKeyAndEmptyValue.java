package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithEmptyStringAndNullAndEmptyKeyAndEmptyValue {

    @Test
    public void testAppendKeyValWithEmptyStringAndNullAndEmptyKeyAndEmptyValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("", null);

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertEquals(1, urlBuilder.getKeys().size());
    }

}