package org.jsoup.nodes;

public class GeneratedSplitText_SplitsTextNodeCorrectlyAtOffset {

    @Test
    public void splitText_SplitsTextNodeCorrectlyAtOffset() {
        // Arrange
        String text = "Hello World";
        int offset = 6;

        // Act
        TextNode newNode = textNode.splitText(offset);

        // Assert
        assertEquals("Hello", newNode.value);
        assertEquals("World", parentNode.children(1).value);
    }

}