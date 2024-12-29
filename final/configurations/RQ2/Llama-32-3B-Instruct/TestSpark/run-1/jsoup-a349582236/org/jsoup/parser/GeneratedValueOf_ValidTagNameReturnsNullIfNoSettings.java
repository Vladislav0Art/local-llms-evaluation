package org.jsoup.parser;

public class GeneratedValueOf_ValidTagNameReturnsNullIfNoSettings {

    @Test
    public void valueOf_ValidTagNameReturnsNullIfNoSettings() {
        // Arrange
        String tagName = "p";
        ParseSettings settings = null;

        // Act
        Tag tag = Tag.valueOf(tagName, settings);

        // Assert
        assertNull(tag);
    }

}