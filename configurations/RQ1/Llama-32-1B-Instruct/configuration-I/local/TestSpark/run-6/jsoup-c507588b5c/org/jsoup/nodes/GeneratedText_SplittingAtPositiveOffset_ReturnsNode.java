package org.jsoup.nodes;

public class GeneratedText_SplittingAtPositiveOffset_ReturnsNode {

    @Test
    public void text_SplittingAtPositiveOffset_ReturnsNode() {
        // Arrange
        String encodedText = "";
        int offset = 1;
        Document doc = new Document();
        Appendable accum = new StringBuilder();

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertNotNull(result);
    }

}