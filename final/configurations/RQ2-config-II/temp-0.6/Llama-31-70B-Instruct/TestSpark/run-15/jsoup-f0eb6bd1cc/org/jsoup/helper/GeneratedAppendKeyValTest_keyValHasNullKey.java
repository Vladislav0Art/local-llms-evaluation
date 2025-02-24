package org.jsoup.helper;

public class GeneratedAppendKeyValTest_keyValHasNullKey {

    private static final String TEST_URL = "http://www.example.com/test";

    @Test
    public void appendKeyValTest_keyValHasNullKey() throws UnsupportedEncodingException, MalformedURLException {
        URL expectedUrl = new URL(TEST_URL);
        UrlBuilder urlBuilder = new UrlBuilder(expectedUrl);
        Connection.KeyVal keyVal = new Connection.KeyVal(null, "value");
        urlBuilder.appendKeyVal(keyVal);
        URL actualUrl = urlBuilder.build();
        assertNotEquals(expectedUrl, actualUrl);
    }

}