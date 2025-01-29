package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_invalid_pair {

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

}