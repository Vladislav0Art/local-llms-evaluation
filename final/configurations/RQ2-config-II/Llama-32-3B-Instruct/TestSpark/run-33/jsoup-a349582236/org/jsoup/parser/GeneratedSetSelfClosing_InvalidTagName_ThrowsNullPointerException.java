package org.jsoup.parser;

public class GeneratedSetSelfClosing_InvalidTagName_ThrowsNullPointerException {

    @Test
    public void setSelfClosing_InvalidTagName_ThrowsNullPointerException() {
        String invalidTagName = null;
        try {
            org.jsoup.parser.Tag.setSelfClosing(invalidTagName, true);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}