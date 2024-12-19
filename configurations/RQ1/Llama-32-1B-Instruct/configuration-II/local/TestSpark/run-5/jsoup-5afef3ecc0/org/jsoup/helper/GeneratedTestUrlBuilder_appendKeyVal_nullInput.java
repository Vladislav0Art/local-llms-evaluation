package org.jsoup.helper;

public class GeneratedTestUrlBuilder_appendKeyVal_nullInput {

    @Test
    public void testUrlBuilder_appendKeyVal_nullInput() {
        // Test case for appendKeyVal method with a null input type
        UrlBuilder builder = new URLBuilder(new URI("https://example.com/path?query=value"));
        try {
            builder.appendKeyVal(null); // invalid KeyVal object
        } catch (UnsupportedEncodingException e) {
            fail("Expected UnsupportedEncodingException, but got " + e.getMessage());
        }
    }

}