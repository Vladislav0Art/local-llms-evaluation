package org.jsoup.parser;

public class GeneratedGetName_InvalidTagName_ThrowsNullPointerException {

    @Test
    public void getName_InvalidTagName_ThrowsNullPointerException() {
        String invalidTagName = null;
        try {
            org.jsoup.parser.Tag.getName(invalidTagName);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}