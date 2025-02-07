package org.jsoup.nodes;

public class GeneratedTest outerHtmlHead {

    @Test
    public void test

    outerHtmlHead() {
        // Arrange
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // Act
        TextNode outerHtmlHead = TextNode.outerHtmlHead(document, 0, null);

        // Assert
        assertTrue(outerHtmlHead.isBlank());
    }

}