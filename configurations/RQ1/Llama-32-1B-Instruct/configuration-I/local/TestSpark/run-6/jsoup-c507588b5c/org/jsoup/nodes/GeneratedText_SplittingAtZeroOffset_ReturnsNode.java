package org.jsoup.nodes;

public class GeneratedText_SplittingAtZeroOffset_ReturnsNode {

    @Test
    public void text_SplittingAtZeroOffset_ReturnsNode() {
        // Arrange
        String encodedText = "";
        int offset = 0;
        Document doc = new Document();
        Appendable accum = new StringBuilder();

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertNotNull(result);
    }

}