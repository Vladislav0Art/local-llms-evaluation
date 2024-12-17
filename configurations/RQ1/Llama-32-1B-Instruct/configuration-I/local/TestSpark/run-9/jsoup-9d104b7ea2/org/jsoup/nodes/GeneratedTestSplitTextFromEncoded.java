package org.jsoup.nodes;

public class GeneratedTestSplitTextFromEncoded {

    @Test
    public void testSplitTextFromEncoded() {
        // Arrange
        String encodedText = "&lt;Hello&amp;gt;&lt;/world&gt;";
        Document document = new Document();
        Appendable accumulator = new StringBuilder();

        // Act
        TextNode currentNode = new TextNode(document, accumulator);
        currentNode.text(fromEncoded(encodedText));

        // Assert
        assertEquals(5, (int) currentNode.splitText(4).siblingIndex());
    }

}