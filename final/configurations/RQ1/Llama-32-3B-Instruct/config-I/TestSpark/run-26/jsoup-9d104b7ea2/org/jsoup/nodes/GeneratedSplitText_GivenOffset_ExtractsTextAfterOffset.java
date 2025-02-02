package org.jsoup.nodes;

public class GeneratedSplitText_GivenOffset_ExtractsTextAfterOffset {

    @Test
    public void splitText_GivenOffset_ExtractsTextAfterOffset() {
        // Given
        String text = "Hello World";
        int offset = 7;

        // When
        TextNode textNode = new TextNode(text);
        TextNode result = textNode.splitText(offset);

        // Then
        assertEquals(4, result.text().length());
    }

}