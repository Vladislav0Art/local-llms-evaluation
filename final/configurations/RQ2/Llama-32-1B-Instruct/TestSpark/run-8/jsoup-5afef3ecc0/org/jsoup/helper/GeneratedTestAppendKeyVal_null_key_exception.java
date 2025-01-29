package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_null_key_exception {

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

}