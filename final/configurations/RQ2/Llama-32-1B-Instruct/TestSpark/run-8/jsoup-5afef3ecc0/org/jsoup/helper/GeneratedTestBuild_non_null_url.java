package org.jsoup.helper;

public class GeneratedTestBuild_non_null_url {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        // Initialize URLBuilder instance before each test case.
    }

    @After
    public void tearDown() {
        // Clean up the system after each test case.
    }

    /**
     * Test that `UrlBuilder#build()` returns a valid URL when given a non-null input URL.
     */

    @Test
    public void testBuild_non_null_url() {
        String url = "https://example.com";
        URLBuilder builder = new UrlBuilder(url);
        URL result = builder.build();
        URI uri = URI.create(result.toString());
        assertTrue(uri.getScheme().equals("https"));
        assertTrue(uri.getHost().contains(url));
    }

}