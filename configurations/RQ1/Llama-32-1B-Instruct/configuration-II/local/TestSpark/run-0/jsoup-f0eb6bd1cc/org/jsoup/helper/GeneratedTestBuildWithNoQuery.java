package org.jsoup.helper;

public class GeneratedTestBuildWithNoQuery {

    private static UrlBuilder urlBuilder;
    private static String inputUrl;

    @BeforeClass
    public static void setup() {
        URL originalInputUrl = System.getProperty("url.http.default") == null ? null : new URI(originalInputUrl).toURL();
        inputUrl = originalInputUrl;
    }

    @Test
    public void testBuildWithNoQuery() {
        urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(inputUrl, urlBuilder.build().getProtocol());
        assertEquals(null, urlBuilder.build().getQuery());
        assertEquals(originalInputUrl, urlBuilder.build().getPath());
    }

}