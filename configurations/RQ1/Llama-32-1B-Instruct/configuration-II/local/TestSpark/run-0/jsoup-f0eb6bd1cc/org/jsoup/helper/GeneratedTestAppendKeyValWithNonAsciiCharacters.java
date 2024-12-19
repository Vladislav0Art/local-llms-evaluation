package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithNonAsciiCharacters {

    private static UrlBuilder urlBuilder;
    private static String inputUrl;

    @BeforeClass
    public static void setup() {
        URL originalInputUrl = System.getProperty("url.http.default") == null ? null : new URI(originalInputUrl).toURL();
        inputUrl = originalInputUrl;
    }

    @Test
    public void testAppendKeyValWithNonAsciiCharacters() {
        urlBuilder = new UrlBuilder(inputUrl);
        String nonAsciiKey = "\u0020";
        String nonAsciiValue = "value with \xFF\u2023";
        urlBuilder.appendKeyVal(Connection.KeyVal.of(nonAsciiKey, nonAsciiValue));
        assertEquals("key%20with%23", urlBuilder.build().getQuery());
    }

}