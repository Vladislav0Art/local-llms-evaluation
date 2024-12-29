package org.jsoup.parser;

public class GeneratedToString_ValidTagNameReturnsSameString {

    @Test
    public void toString_ValidTagNameReturnsSameString() {
        // Arrange
        String tagName = "div";
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf(tagName, settings);
        String expected = tagName;

        // Act
        String result = tag.toString();

        // Assert
        assertEquals(expected, result);
    }

}