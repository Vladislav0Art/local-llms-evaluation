package org.jsoup.nodes;

public class GeneratedSplitText_GivenTextNodeAtOffset_ReturnsNewTextNode {

    @Test
    public void splitText_GivenTextNodeAtOffset_ReturnsNewTextNode() throws IOException {
        // Arrange & Act
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        int offset = 6;
        TextNode result = textNode.splitText(offset);

        // Assert
        assertNotNull(result);
    }

}