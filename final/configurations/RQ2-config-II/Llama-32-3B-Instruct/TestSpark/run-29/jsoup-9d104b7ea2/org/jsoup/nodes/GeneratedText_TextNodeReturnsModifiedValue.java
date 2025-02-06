package org.jsoup.nodes;

public class GeneratedText_TextNodeReturnsModifiedValue {

    @Test
    public void text_TextNodeReturnsModifiedValue() {
        // Arrange
        TextNode node = new TextNameSpace("test");

        // Act
        String actual = node.text("modified test");

        // Assert
        assertEquals("modified test", actual);
    }

}