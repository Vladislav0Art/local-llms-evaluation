package org.jsoup.helper;

public class GeneratedAppendKeyValTest {

    private static final String TEST_URL = "http://www.example.com/test";

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException, MalformedURLException {
        URL expectedUrl = new URL(TEST_URL);
        UrlBuilder urlBuilder = new UrlBuilder(expectedUrl);
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(keyVal);
        URL actualUrl = urlBuilder.build();
        assertNotEquals(expectedUrl, actualUrl);
    }

}