package org.jsoup.nodes;

public class GeneratedSplitText_TextNode_SplitsTextAtOffset {

    @Test
    public void splitText_TextNode_SplitsTextAtOffset() {
        // Given
        TextNode textNode = new TextNode("Hello World");
        int offset = 6;

        // When
        String[] splitText = textNode.splitText(offset);

        // Then
        assertEquals(2, splitText.length);
    }

}