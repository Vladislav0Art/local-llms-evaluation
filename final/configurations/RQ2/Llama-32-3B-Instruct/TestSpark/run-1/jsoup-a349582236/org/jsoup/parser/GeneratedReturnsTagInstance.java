package org.jsoup.parser;

public class GeneratedReturnsTagInstance {

    private static final String TAGS = "img,div,span";

    @Test
    public void returnsTagInstance() {
        // Arrange
        String tagName = "div";
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf(tagName, settings);

        // Act
        Object cloned = tag.clone();

        // Assert
        assertEquals(tag, cloned);
    }

}