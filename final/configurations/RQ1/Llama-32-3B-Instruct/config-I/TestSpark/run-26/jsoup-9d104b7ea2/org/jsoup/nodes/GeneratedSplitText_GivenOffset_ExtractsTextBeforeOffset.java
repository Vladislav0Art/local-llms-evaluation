package org.jsoup.nodes;

public class GeneratedSplitText_GivenOffset_ExtractsTextBeforeOffset {

    @Test
    public void splitText_GivenOffset_ExtractsTextBeforeOffset() {
        // Given
        String text = "Hello World";
        int offset = 5;

        // When
        TextNode textNode = new TextNode(text);
        TextNode result = textNode.splitText(offset);

        // Then
        assertEquals(5, result.text().length());
    }

}