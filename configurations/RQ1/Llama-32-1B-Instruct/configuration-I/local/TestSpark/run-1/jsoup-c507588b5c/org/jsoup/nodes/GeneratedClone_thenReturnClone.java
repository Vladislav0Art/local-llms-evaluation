package org.jsoup.nodes;

public class GeneratedClone_thenReturnClone {

    @Test
    public void clone_thenReturnClone() {
        // Arrange
        TextNode text = new TextNode("Hello World");

        // Act
        TextNode clonedText = (TextNode) text.clone();

        // Assert
        assertEquals(text, clonedText);
    }

}