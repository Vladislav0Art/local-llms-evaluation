package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithNullQ {

    private static UrlBuilder urlBuilder;
    private static String inputUrl;

    @BeforeClass
    public static void setup() {
        URL originalInputUrl = System.getProperty("url.http.default") == null ? null : new URI(originalInputUrl).toURL();
        inputUrl = originalInputUrl;
    }

    @Test
    public void testAppendKeyValWithNullQ() {
        urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(null);
        assertEquals("", urlBuilder.build().getQuery());
    }

}