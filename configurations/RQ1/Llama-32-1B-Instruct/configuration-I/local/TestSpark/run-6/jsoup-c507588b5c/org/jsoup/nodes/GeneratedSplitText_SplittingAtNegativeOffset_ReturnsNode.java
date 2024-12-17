package org.jsoup.nodes;

public class GeneratedSplitText_SplittingAtNegativeOffset_ReturnsNode {

    @Test
    public void splitText_SplittingAtNegativeOffset_ReturnsNode() {
        // Arrange
        String encodedText = "";
        int offset = -1;
        Document doc = new Document();
        Appendable accum = new StringBuilder();

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertNotNull(result);
    }

}