package org.jsoup.parser;

public class GeneratedIsFormSubmittable TagsThatAreFormElementsAndSelfClosingReturnsFalse {

    @Test
    public void isFormSubmittable

    TagsThatAreFormElementsAndSelfClosingReturnsFalse() {
        // Arrange
        String tagName = "img";
        ParseSettings settings = new ParseSettings();
        boolean result = false;

        // Act
        Tag tag = Tag.valueOf(tagName, settings);
        result = tag.isFormSubmittable();

        // Assert
        assertFalse(result);
    }

}