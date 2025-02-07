package org.jsoup.nodes;

public class GeneratedTest lastCharIsWhitespace {

    @Test
    public void test

    lastCharIsWhitespace() {
        // Arrange
        String text = "   Hello World";
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // Act
        TextNode lastCharIsWhitespace = TextNode.lastCharIsWhitespace(document, accum);

        // Assert
        assertTrue(lastCharIsWhitespace.text().equals("World"));
    }

}