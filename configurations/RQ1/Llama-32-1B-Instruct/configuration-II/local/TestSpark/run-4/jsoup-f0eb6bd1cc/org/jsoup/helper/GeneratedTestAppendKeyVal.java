package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    private final String url;

    @BeforeClass
    public static void init() throws MalformedURLException, URISyntaxException {
        // Initialize URLs for testing
        url = "https://example.com/path/to/resource?param=value#anchor";
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URI(url));
        StringBuilder sb = new StringBuilder();
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        URL normalizedUrl = builder.build();
        assertEquals(sb.toString(), normalizedUrl);
    }

}