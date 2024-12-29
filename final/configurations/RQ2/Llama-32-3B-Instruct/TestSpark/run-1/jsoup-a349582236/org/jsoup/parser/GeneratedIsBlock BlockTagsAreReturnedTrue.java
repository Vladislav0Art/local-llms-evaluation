package org.jsoup.parser;

public class GeneratedIsBlock BlockTagsAreReturnedTrue {

    @Test
    public void isBlock

    BlockTagsAreReturnedTrue() {
        // Arrange
        String tagName = "div";
        ParseSettings settings = new ParseSettings();
        boolean result = false;

        // Act
        Tag tag = Tag.valueOf(tagName, settings);
        result = tag.isBlock();

        // Assert
        assertTrue(result);
    }

}