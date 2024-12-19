package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_InvalidEncoding {

    private final String url;

    @BeforeClass
    public static void init() throws MalformedURLException, URISyntaxException {
        // Initialize URLs for testing
        url = "https://example.com/path/to/resource?param=value#anchor";
    }

    @Test
    public void testAppendKeyVal_InvalidEncoding() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URI(url));
        StringBuilder sb = new StringBuilder();
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        URL normalizedUrl = builder.build();
        // The UnsupportedEncodingException should not be thrown in this case
    }

}