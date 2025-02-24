package org.jsoup.helper;

public class GeneratedAppendKeyValTest_keyValIsNull {

    private static final String TEST_URL = "http://www.example.com/test";

    @Test
    public void appendKeyValTest_keyValIsNull() throws UnsupportedEncodingException, MalformedURLException {
        URL expectedUrl = new URL(TEST_URL);
        UrlBuilder urlBuilder = new UrlBuilder(expectedUrl);
        urlBuilder.appendKeyVal(null);
        URL actualUrl = urlBuilder.build();
        assertEquals(expectedUrl, actualUrl);
    }

}