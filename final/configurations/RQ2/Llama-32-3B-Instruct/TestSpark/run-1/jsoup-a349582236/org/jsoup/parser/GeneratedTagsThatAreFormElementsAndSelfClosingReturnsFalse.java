package org.jsoup.parser;

public class GeneratedTagsThatAreFormElementsAndSelfClosingReturnsFalse {

    private static final String TAGS = "img,div,span";

    @Test
    public void tagsThatAreFormElementsAndSelfClosingReturnsFalse() {
        // Arrange
        String tagName = "img";
        ParseSettings settings = new ParseSettings();
        boolean result = false;

        // Act
        Tag tag = Tag.valueOf(tagName, settings);
        result = tag.isBlock();

        // Assert
        assertTrue(result);
    }

}