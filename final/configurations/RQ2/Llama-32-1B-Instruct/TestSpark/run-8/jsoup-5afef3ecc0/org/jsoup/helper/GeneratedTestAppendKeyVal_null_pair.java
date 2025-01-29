package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_null_pair {

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
    public void testAppendKeyVal_null_pair() {
        String url = "https://example.com";
        URLBuilder builder = new UrlBuilder(url);
        Object[] kv = {null, "key", 42};
        builder.appendKeyVal(kv);
        assertEquals("", builder.build().toString());
    }

}