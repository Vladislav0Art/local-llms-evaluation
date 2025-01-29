package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        // Arrange
        Document document = new Document();
        Appendable appender = document.createDocumentFragment();
        String text = "Hello";
        int offset = 3;
        TextNode expectedTextNode = new TextNode(text.substring(0, offset));

        // Act
        TextNode textNode = new TextNode.splitText(offset);

        // Assert
        assertEquals(expectedTextNode, textNode);
    }

}