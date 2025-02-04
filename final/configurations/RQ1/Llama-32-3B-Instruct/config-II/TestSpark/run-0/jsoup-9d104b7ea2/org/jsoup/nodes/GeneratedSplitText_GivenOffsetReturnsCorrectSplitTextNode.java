package org.jsoup.nodes;

public class GeneratedSplitText_GivenOffsetReturnsCorrectSplitTextNode {

    @Test
    public void splitText_GivenOffsetReturnsCorrectSplitTextNode() throws IOException {
        // Given
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        int offset = 5;
        TextNode tailNode = new TextNode();

        // When
        TextNode result = textNode.splitText(offset);

        // Then
        assertEquals(tailNode, result.text());
    }

}