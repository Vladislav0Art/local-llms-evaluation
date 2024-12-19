package org.jsoup.helper;

public class GeneratedTestBuildUrls {

    private final String url;

    @BeforeClass
    public static void init() throws MalformedURLException, URISyntaxException {
        // Initialize URLs for testing
        url = "https://example.com/path/to/resource?param=value#anchor";
    }

    @Test
    public void testBuildUrls() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URI(url));
        URL originalUrl = url;
        URL normalizedUrl = builder.build();
        assertEquals(originalUrl, normalizedUrl);
    }

}