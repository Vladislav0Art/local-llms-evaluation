package org.jsoup.helper;

public class GeneratedTestUrlBuilder_appendKeyVal_unexpectedInput {

    @Test
    public void testUrlBuilder_appendKeyVal_unexpectedInput() {
        // Test case for appendKeyVal method with an unexpected input type
        UrlBuilder builder = new URLBuilder(new URI("https://example.com/path?query=value"));
        try {
            builder.appendKeyVal(123); // invalid KeyVal object
        } catch (UnsupportedEncodingException e) {
            fail("Expected UnsupportedEncodingException, but got " + e.getMessage());
        }
    }

}