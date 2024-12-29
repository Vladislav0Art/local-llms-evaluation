package org.jsoup.parser;

public class GeneratedSetSelfClosing ReturnsTagInstance {

    @Test
    public void setSelfClosing

    ReturnsTagInstance() {
        // Arrange
        String tagName = "img";
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf(tagName, settings);

        // Act
        boolean result = tag.setSelfClosing();

        // Assert
        assertTrue(result);
    }

}