package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        // Arrange
        String text = "Hello World";

        // Act
        TextNode cloned = TextNode.clone();

        // Assert
        assertEquals(text, cloned.getWholeText());
    }

}