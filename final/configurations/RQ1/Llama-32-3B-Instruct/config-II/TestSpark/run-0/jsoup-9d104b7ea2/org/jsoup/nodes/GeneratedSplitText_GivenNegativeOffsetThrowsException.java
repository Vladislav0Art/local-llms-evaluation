package org.jsoup.nodes;

public class GeneratedSplitText_GivenNegativeOffsetThrowsException {

    @Test
    public void splitText_GivenNegativeOffsetThrowsException() {
        // Given
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        int offset = -5;

        // When
        assertThrows(IllegalArgumentException.class, () -> textNode.splitText(offset));
    }

}