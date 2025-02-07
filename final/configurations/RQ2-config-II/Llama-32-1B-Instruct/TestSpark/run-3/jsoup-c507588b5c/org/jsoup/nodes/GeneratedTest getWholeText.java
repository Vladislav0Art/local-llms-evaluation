package org.jsoup.nodes;

public class GeneratedTest getWholeText {

    @Test
    public void test

    getWholeText() {
        // Arrange
        String text = "Hello, World!";
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // Act
        String wholeText = TextNode.getWholeText(document, accum);

        // Assert
        assertEquals("Hello, World!", wholeText);
    }

}