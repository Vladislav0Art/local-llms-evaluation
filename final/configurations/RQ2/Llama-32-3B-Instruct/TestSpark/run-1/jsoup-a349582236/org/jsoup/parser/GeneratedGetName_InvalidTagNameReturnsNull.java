package org.jsoup.parser;

public class GeneratedGetName_InvalidTagNameReturnsNull {

    @Test
    public void getName_InvalidTagNameReturnsNull() {
        // Arrange
        String tagName = "invalid";
        Tag tag = null;

        // Act
        String name = tag.getName();

        // Assert
        assertNull(name);
    }

}