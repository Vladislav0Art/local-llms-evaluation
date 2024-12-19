package org.jsoup.helper;

public class GeneratedTestAppendToAscii {

    private final String url;

    @BeforeClass
    public static void init() throws MalformedURLException, URISyntaxException {
        // Initialize URLs for testing
        url = "https://example.com/path/to/resource?param=value#anchor";
    }

    @Test
    public void testAppendToAscii() throws UnsupportedEncodingException {
        URL originalUrl = new URI(
                "https://example.com/path/to/resource?param=value#anchor",
                null, null, null,
                null, null, null
        );
        StringBuilder sb = new StringBuilder();
        UrlBuilder builder = new UrlBuilder(originalUrl);
        String normalizedUrl = builder.build().toString();
        assertEquals("path\\to\\resource?param=value#anchor", normalizedUrl);
    }

}