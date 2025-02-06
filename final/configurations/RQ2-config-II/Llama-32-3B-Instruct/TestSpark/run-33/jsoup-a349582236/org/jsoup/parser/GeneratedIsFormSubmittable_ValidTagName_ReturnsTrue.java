package org.jsoup.parser;

public class GeneratedIsFormSubmittable_ValidTagName_ReturnsTrue {

    @Test
    public void isFormSubmittable_ValidTagName_ReturnsTrue() {
        String tagName = "input";
        boolean actualResult = org.jsoup.parser.Tag.isFormSubmittable(tagName);
        assertTrue(actualResult);
    }

}