package org.jsoup.parser;

public class GeneratedNormalName_ValidNameContainsOnlyAlphanumericCharactersAndUnderscores {

    @Test
    public void normalName_ValidNameContainsOnlyAlphanumericCharactersAndUnderscores() {
        // Arrange
        String tagName = "_test-tag";
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf(tagName, settings);

        // Act
        String normalizedName = tag.normalName();

        // Assert
        assertTrue(normalizedName.contains("_"));
        assertEquals(1, normalizedName.length());
    }

}