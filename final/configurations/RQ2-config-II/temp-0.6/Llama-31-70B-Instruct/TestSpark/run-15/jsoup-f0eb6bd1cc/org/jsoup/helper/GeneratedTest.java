package org.jsoup.helper;

public class GeneratedTest {

    private static final String TEST_URL = "http://www.example.com/test";

    @Test
    public void buildTest() throws MalformedURLException {
        URL expectedUrl = new URL(TEST_URL);
        UrlBuilder urlBuilder = new UrlBuilder(expectedUrl);
        URL actualUrl = urlBuilder.build();
        assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException, MalformedURLException {
        URL expectedUrl = new URL(TEST_URL);
        UrlBuilder urlBuilder = new UrlBuilder(expectedUrl);
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(keyVal);
        URL actualUrl = urlBuilder.build();
        assertNotEquals(expectedUrl, actualUrl);
    }

    @Test
    public void appendKeyValTest_keyValIsNull() throws UnsupportedEncodingException, MalformedURLException {
        URL expectedUrl = new URL(TEST_URL);
        UrlBuilder urlBuilder = new UrlBuilder(expectedUrl);
        urlBuilder.appendKeyVal(null);
        URL actualUrl = urlBuilder.build();
        assertEquals(expectedUrl, actualUrl);
    }

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