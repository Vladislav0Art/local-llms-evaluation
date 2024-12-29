package org.jsoup.parser;

public class GeneratedIsFormListed TagsThatAreFormElementsAndNotSelfClosingReturnsTrue {

    @Test
    public void isFormListed

    TagsThatAreFormElementsAndNotSelfClosingReturnsTrue() {
        // Arrange
        String tagName = "input";
        ParseSettings settings = new ParseSettings();
        boolean result = false;

        // Act
        Tag tag = Tag.valueOf(tagName, settings);
        result = tag.isFormListed();

        // Assert
        assertTrue(result);
    }

}