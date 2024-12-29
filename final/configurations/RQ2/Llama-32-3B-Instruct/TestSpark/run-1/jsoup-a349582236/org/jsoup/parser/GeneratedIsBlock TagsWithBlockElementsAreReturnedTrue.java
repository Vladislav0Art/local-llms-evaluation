package org.jsoup.parser;

public class GeneratedIsBlock TagsWithBlockElementsAreReturnedTrue {

    @Test
    public void isBlock

    TagsWithBlockElementsAreReturnedTrue() {
        // Arrange
        String tagName = "img";
        ParseSettings settings = new ParseSettings();
        boolean result = false;

        // Act
        Tag tag = Tag.valueOf(tagName, settings);
        result = tag.isBlock();

        // Assert
        assertFalse(result);
    }

}