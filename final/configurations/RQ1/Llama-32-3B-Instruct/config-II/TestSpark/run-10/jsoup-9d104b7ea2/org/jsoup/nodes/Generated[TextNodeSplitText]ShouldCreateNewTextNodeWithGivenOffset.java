package org.jsoup.nodes;

public class Generated[TextNodeSplitText]

ShouldCreateNewTextNodeWithGivenOffset {

    @Test
    public void [TextNodeSplitText]ShouldCreateNewTextNodeWithGivenOffset() {
        // Arrange
        String expectedTextAfterOffset = "World";
        TextNode expectedTextNodeAfterOffset = new TextNode(expectedTextAfterOffset);

        // Act
        TextNode textNode = new TextNode("Hello World");
        TextNode actualTextNode = textNode.splitText(5);

        // Assert
        assertEquals(expectedTextNodeAfterOffset, actualTextNode);
    }

}