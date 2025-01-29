package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithEmptyStringAndNullAndEmptyKey {

    @Test
    public void testAppendKeyValWithEmptyStringAndNullAndEmptyKey() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("", "");

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertEquals(1, urlBuilder.getKeys().size());
    }

}