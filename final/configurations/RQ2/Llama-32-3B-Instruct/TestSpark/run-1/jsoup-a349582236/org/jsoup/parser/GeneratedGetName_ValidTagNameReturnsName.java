package org.jsoup.parser;

public class GeneratedGetName_ValidTagNameReturnsName {

    @Test
    public void getName_ValidTagNameReturnsName() {
        // Arrange
        String tagName = "div";
        Tag tag = Tag.valueOf(tagName);

        // Act
        String name = tag.getName();

        // Assert
        assertTrue(Validate.notBlank(name));
        assertEquals(tagName, name);
    }

}