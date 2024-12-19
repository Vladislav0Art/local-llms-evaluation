package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithEmptyKey {

    private static UrlBuilder urlBuilder;
    private static String inputUrl;

    @BeforeClass
    public static void setup() {
        URL originalInputUrl = System.getProperty("url.http.default") == null ? null : new URI(originalInputUrl).toURL();
        inputUrl = originalInputUrl;
    }

    @Test
    public void testAppendKeyValWithEmptyKey() {
        urlBuilder = new UrlBuilder(inputUrl);
        String emptyKey = "";
        try {
            urlBuilder.appendKeyVal(emptyKey);
        } catch (UnsupportedEncodingException e) {
            fail("Expected UnsupportedEncodingException");
        }
    }

}