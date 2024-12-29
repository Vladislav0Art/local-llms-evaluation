package org.jsoup.parser;

public class GeneratedEquals_ValidTagReturnsTrue {

    @Test
    public void equals_ValidTagReturnsTrue() {
        // Arrange
        String tagName = "div";
        ParseSettings settings = new ParseSettings();
        Tag tag1 = Tag.valueOf(tagName, settings);
        Tag tag2 = Tag.valueOf(tagName, settings);

        // Act
        boolean result = tag1.equals(tag2);

        // Assert
        assertTrue(result);
    }

}