package org.jsoup.helper;

public class GeneratedTestEncodePath {

    private final String url;

    @BeforeClass
    public static void init() throws MalformedURLException, URISyntaxException {
        // Initialize URLs for testing
        url = "https://example.com/path/to/resource?param=value#anchor";
    }

    @Test
    public void testEncodePath() throws UnsupportedEncodingException {
        URL originalUrl = new URI(
                "https://example.com/path/to/resource?param=value#anchor",
                null, null, null,
                null, null, null
        );
        String normalizedPath = UrlBuilder.decodePart(originalUrl.getPath());
        assertEquals("path\\to\\resource", normalizedPath);
    }

}