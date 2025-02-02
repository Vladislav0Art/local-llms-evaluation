package org.jsoup.nodes;

public class GeneratedSplitText_GivenInvalidOffset_ThrowsIllegalArgumentException {

    @Test
    public void splitText_GivenInvalidOffset_ThrowsIllegalArgumentException() {
        // Given
        TextNode textNode = new TextNode("Hello World");
        int offset = 10;

        // When
        assertThrows(IllegalArgumentException.class, () -> textNode.splitText(offset));
    }

}