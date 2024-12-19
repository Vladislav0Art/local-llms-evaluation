package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithEmptyKeyVal {

    private static UrlBuilder urlBuilder;
    private static String inputUrl;

    @BeforeClass
    public static void setup() {
        URL originalInputUrl = System.getProperty("url.http.default") == null ? null : new URI(originalInputUrl).toURL();
        inputUrl = originalInputUrl;
    }

    @Test
    public void testAppendKeyValWithEmptyKeyVal() {
        urlBuilder = new UrlBuilder(inputUrl);
        String emptyKey = "";
        String emptyValue = "";
        urlBuilder.appendKeyVal(Connection.KeyVal.of(emptyKey, emptyValue));
        assertEquals("", urlBuilder.build().getQuery());
    }

}