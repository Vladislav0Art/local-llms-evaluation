package org.jsoup.parser;

public class GeneratedClone_ValidTagNameReturnsSameTag {

    @Test
    public void clone_ValidTagNameReturnsSameTag() {
        // Arrange
        String tagName = "div";
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf(tagName, settings);

        // Act
        Tag cloned = tag.clone();

        // Assert
        assertEquals(tag, cloned);
    }

}