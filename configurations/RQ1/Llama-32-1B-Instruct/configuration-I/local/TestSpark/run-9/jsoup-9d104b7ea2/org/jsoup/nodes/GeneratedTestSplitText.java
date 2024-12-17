package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        // Arrange
        String text = "   Hello World!   ";
        int offset = 6;
        Document document = new Document();
        Appendable accumulator = new StringBuilder();

        // Act
        TextNode currentNode = new TextNode(document, accumulator);
        currentNode.text(text);

        // Assert
        assertEquals(5, (int) currentNode.splitText(offset).siblingIndex());
    }

}