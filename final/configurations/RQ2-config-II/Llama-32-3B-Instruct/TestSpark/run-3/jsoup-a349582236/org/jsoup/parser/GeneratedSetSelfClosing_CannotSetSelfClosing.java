package org.jsoup.parser;

public class GeneratedSetSelfClosing_CannotSetSelfClosing {

    @Test
    public void setSelfClosing_CannotSetSelfClosing() {
        // Arrange
        Tag tag = new Tag();
        ParseSettings settings = new ParseSettings();

        // Act and Assert
        assertThrows(IllegalStateException.class, () -> tag.setSelfClosing());
    }

}