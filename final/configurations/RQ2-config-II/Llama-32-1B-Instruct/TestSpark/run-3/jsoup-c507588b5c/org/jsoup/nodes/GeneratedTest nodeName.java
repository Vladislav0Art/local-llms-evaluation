package org.jsoup.nodes;

public class GeneratedTest nodeName {

    @Test
    public void test

    nodeName() {
        // Arrange
        String text = "Hello, World!";
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // Act
        String nodeName = TextNode.nodeName(document, accum);

        // Assert
        assertEquals("HTML", nodeName);
    }

}