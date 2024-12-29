package org.jsoup.parser;

public class GeneratedTagsWithInlineElementsAreReturnedTrue {

    private static final String TAGS = "img,div,span";

    @Test
    public void tagsWithInlineElementsAreReturnedTrue() {
        // Arrange
        String tagName = "span";
        ParseSettings settings = new ParseSettings();
        boolean result = false;

        // Act
        Tag tag = Tag.valueOf(tagName, settings);
        result = tag.isInline();

        // Assert
        assertTrue(result);
    }

}