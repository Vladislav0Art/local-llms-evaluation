package org.jsoup.helper;

public class GeneratedTestDecodePart {

    private final String url;

    @BeforeClass
    public static void init() throws MalformedURLException, URISyntaxException {
        // Initialize URLs for testing
        url = "https://example.com/path/to/resource?param=value#anchor";
    }

    @Test
    public void testDecodePart() throws MalformedURLException, URISyntaxException {
        String encoded = "abc";
        String decoded = UrlBuilder.decodePart(encoded);
        assertEquals("abc", decoded);
    }

}