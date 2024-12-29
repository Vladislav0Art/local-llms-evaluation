package org.jsoup.parser;

public class GeneratedTagsWithBlockElementsAreReturnedTrue {

    private static final String TAGS = "img,div,span";

    @Test
    public void tagsWithBlockElementsAreReturnedTrue() {
        // Arrange
        String tagName = TAGS;
        ParseSettings settings = new ParseSettings();
        boolean result = false;

        // Act
        Tag tag = Tag.valueOf(tagName, settings);
        result = tag.isBlock();

        // Assert
        assertFalse(result);
    }

}