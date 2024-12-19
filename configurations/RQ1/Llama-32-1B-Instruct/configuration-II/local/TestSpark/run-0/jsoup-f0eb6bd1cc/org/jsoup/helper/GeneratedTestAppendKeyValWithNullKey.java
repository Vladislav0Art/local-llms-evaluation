package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithNullKey {

    private static UrlBuilder urlBuilder;
    private static String inputUrl;

    @BeforeClass
    public static void setup() {
        URL originalInputUrl = System.getProperty("url.http.default") == null ? null : new URI(originalInputUrl).toURL();
        inputUrl = originalInputUrl;
    }

    @Test
    public void testAppendKeyValWithNullKey() {
        urlBuilder = new UrlBuilder(inputUrl);
        String nullKey = "";
        try {
            urlBuilder.appendKeyVal(null);
        } catch (UnsupportedEncodingException e) {
            fail("Expected UnsupportedEncodingException");
        }
    }

}