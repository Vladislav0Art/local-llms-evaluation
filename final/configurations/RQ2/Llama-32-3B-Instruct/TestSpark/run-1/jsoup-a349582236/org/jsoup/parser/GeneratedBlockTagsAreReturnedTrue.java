package org.jsoup.parser;

public class GeneratedBlockTagsAreReturnedTrue {

    private static final String TAGS = "img,div,span";

    @Test
    public void blockTagsAreReturnedTrue() {
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