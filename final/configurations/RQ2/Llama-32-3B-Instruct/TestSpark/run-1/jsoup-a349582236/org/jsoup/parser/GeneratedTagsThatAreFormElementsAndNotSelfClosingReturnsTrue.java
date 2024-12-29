package org.jsoup.parser;

public class GeneratedTagsThatAreFormElementsAndNotSelfClosingReturnsTrue {

    private static final String TAGS = "img,div,span";

    @Test
    public void tagsThatAreFormElementsAndNotSelfClosingReturnsTrue() {
        // Arrange
        String tagName = "input";
        ParseSettings settings = new ParseSettings();
        boolean result = false;

        // Act
        Tag tag = Tag.valueOf(tagName, settings);
        result = tag.isBlock();

        // Assert
        assertFalse(result);
    }

}