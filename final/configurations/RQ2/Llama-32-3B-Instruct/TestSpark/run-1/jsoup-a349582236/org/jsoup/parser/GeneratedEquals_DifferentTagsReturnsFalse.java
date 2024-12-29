package org.jsoup.parser;

public class GeneratedEquals_DifferentTagsReturnsFalse {

    @Test
    public void equals_DifferentTagsReturnsFalse() {
        // Arrange
        String tagName = "div";
        ParseSettings settings = new ParseSettings();
        Tag tag1 = Tag.valueOf(tagName, settings);
        Tag tag2 = Tag.valueOf("span", settings);

        // Act
        boolean result = tag1.equals(tag2);

        // Assert
        assertFalse(result);
    }

}