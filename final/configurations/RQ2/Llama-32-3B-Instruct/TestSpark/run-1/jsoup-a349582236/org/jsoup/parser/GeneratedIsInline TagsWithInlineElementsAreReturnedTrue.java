package org.jsoup.parser;

public class GeneratedIsInline TagsWithInlineElementsAreReturnedTrue {

    @Test
    public void isInline

    TagsWithInlineElementsAreReturnedTrue() {
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