package org.jsoup.parser;

public class GeneratedValueOf_InvalidTagName_ThrowsNullPointerException {

    @Test
    public void valueOf_InvalidTagName_ThrowsNullPointerException() {
        String invalidTagName = null;
        try {
            org.jsoup.parser.Tag.valueOf(invalidTagName);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}