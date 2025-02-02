package org.jsoup.nodes;

public class GeneratedSplitText_GivenOffset_ThrowsIllegalArgumentException {

    @Test
    public void splitText_GivenOffset_ThrowsIllegalArgumentException() {
        // Given
        String text = "Hello World";
        int offset = 10;

        // When
        TextNode textNode = new TextNode(text);
        assertThrows(IllegalArgumentException.class, () -> textNode.splitText(offset));
    }

}