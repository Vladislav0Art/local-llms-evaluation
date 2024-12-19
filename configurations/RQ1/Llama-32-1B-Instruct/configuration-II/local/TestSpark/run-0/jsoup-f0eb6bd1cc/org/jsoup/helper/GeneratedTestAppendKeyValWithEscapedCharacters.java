package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithEscapedCharacters {

    private static UrlBuilder urlBuilder;
    private static String inputUrl;

    @BeforeClass
    public static void setup() {
        URL originalInputUrl = System.getProperty("url.http.default") == null ? null : new URI(originalInputUrl).toURL();
        inputUrl = originalInputUrl;
    }

    @Test
    public void testAppendKeyValWithEscapedCharacters() {
        urlBuilder = new UrlBuilder(inputUrl);
        String escapedKey = "key with %20";
        String escapedValue = "value with \xFF";
        urlBuilder.appendKeyVal(Connection.KeyVal.of(escapedKey, escapedValue));
        assertEquals("key%20with%20%23", urlBuilder.build().getQuery());
    }

}