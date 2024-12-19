package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithNoEscapedCharacters {

    private static UrlBuilder urlBuilder;
    private static String inputUrl;

    @BeforeClass
    public static void setup() {
        URL originalInputUrl = System.getProperty("url.http.default") == null ? null : new URI(originalInputUrl).toURL();
        inputUrl = originalInputUrl;
    }

    @Test
    public void testAppendKeyValWithNoEscapedCharacters() {
        urlBuilder = new UrlBuilder(inputUrl);
        String escapedKey = "key";
        String escapedValue = "value";
        urlBuilder.appendKeyVal(Connection.KeyVal.of(escapedKey, escapedValue));
        assertEquals("key=value", urlBuilder.build().getQuery());
    }

}