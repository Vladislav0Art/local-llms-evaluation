package org.jsoup.parser;

public class GeneratedNormalName_InvalidTagName_ThrowsNullPointerException {

    @Test
    public void normalName_InvalidTagName_ThrowsNullPointerException() {
        String invalidTagName = null;
        try {
            org.jsoup.parser.Tag.normalName(invalidTagName);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}