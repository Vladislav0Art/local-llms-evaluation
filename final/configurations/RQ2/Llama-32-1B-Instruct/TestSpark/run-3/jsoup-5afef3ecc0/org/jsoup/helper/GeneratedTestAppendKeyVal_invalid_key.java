package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_invalid_key {

    @Test
    public void testAppendKeyVal_invalid_key() {
        try {
            UrlBuilder.builder();
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

}