package org.jsoup.nodes;

public class GeneratedSplitTextTextNode_GivenOffset_ReturnsCorrectlySplitText {

    @Test
    public void splitTextTextNode_GivenOffset_ReturnsCorrectlySplitText() {
        // Arrange
        TextNode textNode = new TextNode("test");
        int offset = 3;
        String expectedSplitText = "t";

        // Act
        String splitText = textNode.splitText(offset);

        // Assert
        assertEquals(expectedSplitText, splitText);
    }

}