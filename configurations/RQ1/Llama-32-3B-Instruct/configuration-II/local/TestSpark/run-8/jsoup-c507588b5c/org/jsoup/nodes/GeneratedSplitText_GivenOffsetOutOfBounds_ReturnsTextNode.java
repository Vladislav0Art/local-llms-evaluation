package org.jsoup.nodes;

public class GeneratedSplitText_GivenOffsetOutOfBounds_ReturnsTextNode {

    @Test
    public void splitText_GivenOffsetOutOfBounds_ReturnsTextNode() throws IOException {
        // Arrange & Act
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        int offset = -1;
        TextNode result = textNode.splitText(offset);

        // Assert
        assertNotNull(result);
    }

}