package org.jsoup.parser;

public class GeneratedValueOf_ValidTagNameReturnsTagInstance {

    @Test
    public void valueOf_ValidTagNameReturnsTagInstance() {
        // Arrange
        String tagName = "p";
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf(tagName, settings);

        // Act
        boolean result = Tag.isKnownTag(tagName);
        assertTrue(result);

        // Assert
    }

}