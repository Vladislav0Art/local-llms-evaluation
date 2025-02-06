package org.jsoup.parser;

public class GeneratedIsFormListed_ValidTagName_ReturnsFalse {

    @Test
    public void isFormListed_ValidTagName_ReturnsFalse() {
        String tagName = "img";
        boolean actualResult = org.jsoup.parser.Tag.isFormListed(tagName);
        assertFalse(actualResult);
    }

}