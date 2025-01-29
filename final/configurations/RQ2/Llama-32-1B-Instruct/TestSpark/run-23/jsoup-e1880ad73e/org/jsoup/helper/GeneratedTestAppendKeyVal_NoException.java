package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_NoException {

    private static String inputUrl;

    @Before
    public void setup() {
        // Nothing to set up, just for initialization
    }

    @Test
    public void testAppendKeyVal_NoException() {
        String key = "testKey";
        String value = "testValue";
        Connection.KeyVal kv = new Connection.KeyVal(key, value);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl).appendKeyVal(kv);
        URL url = urlBuilder.build();
        assertNotNull(url);
    }

}