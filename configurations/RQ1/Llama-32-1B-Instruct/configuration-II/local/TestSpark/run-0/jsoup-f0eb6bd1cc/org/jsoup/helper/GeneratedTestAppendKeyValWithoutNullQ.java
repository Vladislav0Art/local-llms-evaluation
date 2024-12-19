package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithoutNullQ {

    private static UrlBuilder urlBuilder;
    private static String inputUrl;

    @BeforeClass
    public static void setup() {
        URL originalInputUrl = System.getProperty("url.http.default") == null ? null : new URI(originalInputUrl).toURL();
        inputUrl = originalInputUrl;
    }

    @Test
    public void testAppendKeyValWithoutNullQ() {
        urlBuilder = new UrlBuilder(inputUrl);
        String encodedKey = "key";
        String encodedValue = "value";
        urlBuilder.appendKeyVal(Connection.KeyVal.of(encodedKey, encodedValue));
        assertEquals("key=value", urlBuilder.build().getQuery());
    }

}