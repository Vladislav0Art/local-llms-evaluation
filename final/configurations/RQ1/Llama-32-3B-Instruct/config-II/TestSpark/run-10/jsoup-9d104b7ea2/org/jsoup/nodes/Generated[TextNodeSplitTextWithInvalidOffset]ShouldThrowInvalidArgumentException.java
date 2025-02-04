package org.jsoup.nodes;

public class Generated[TextNodeSplitTextWithInvalidOffset]

ShouldThrowInvalidArgumentException {

    @Test
    public void [TextNodeSplitTextWithInvalidOffset]ShouldThrowInvalidArgumentException() {
        // Arrange

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> new TextNode("Hello World").splitText(-1));
    }

}