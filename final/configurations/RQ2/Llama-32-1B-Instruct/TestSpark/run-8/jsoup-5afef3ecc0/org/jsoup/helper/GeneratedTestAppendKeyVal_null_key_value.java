package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_null_key_value {

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
    public void testAppendKeyVal_null_key_value() {
        String url = "https://example.com";
        URLBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(null, "key", 42);
        assertEquals("https://example.com?key=42", builder.build().toString());
    }

}