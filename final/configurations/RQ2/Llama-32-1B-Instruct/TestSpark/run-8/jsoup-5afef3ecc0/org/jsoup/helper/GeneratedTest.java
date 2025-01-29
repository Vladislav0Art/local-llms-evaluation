package org.jsoup.helper;

public class GeneratedTest {

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
    public void testBuild_valid_url() {
        String url = "https://example.com";
        URLBuilder builder = new UrlBuilder(url);
        URL result = builder.build();
        URI uri = URI.create(result.toString());
        assertTrue(uri.getScheme().equals("https"));
        assertTrue(uri.getHost().contains(url));
    }

    @Test
    public void testAppendKeyVal_null_pair() {
        String url = "https://example.com";
        URLBuilder builder = new UrlBuilder(url);
        Object[] kv = {null, "key", 42};
        builder.appendKeyVal(kv);
        assertEquals("", builder.build().toString());
    }

    @Test
    public void testAppendKeyVal_invalid_pair() {
        String url = "https://example.com";
        URLBuilder builder = new UrlBuilder(url);
        Object[] kv = {"", 1, "key"};
        try {
            builder.appendKeyVal(kv);
            fail("Expected an exception to be thrown.");
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

    @Test
    public void testAppendKeyVal_null_key_value() {
        String url = "https://example.com";
        URLBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(null, "key", 42);
        assertEquals("https://example.com?key=42", builder.build().toString());
    }

    @Test
    public void testAppendKeyVal_null_key_exception() {
        String url = "https://example.com";
        URLBuilder builder = new UrlBuilder(url);
        try {
            builder.appendKeyVal(null, null, 42);
            fail("Expected an exception to be thrown.");
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

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