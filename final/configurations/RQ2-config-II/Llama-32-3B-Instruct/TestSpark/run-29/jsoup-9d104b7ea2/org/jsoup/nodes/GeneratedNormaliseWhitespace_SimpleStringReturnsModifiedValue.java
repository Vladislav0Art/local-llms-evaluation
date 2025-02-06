package org.jsoup.nodes;

public class GeneratedNormaliseWhitespace_SimpleStringReturnsModifiedValue {

    @Test
    public void normaliseWhitespace_SimpleStringReturnsModifiedValue() {
        // Arrange
        String text = "   test  ";

        // Act
        String actual = TextNode.normaliseWhitespace(text);

        // Assert
        assertEquals("test", actual);
    }

}