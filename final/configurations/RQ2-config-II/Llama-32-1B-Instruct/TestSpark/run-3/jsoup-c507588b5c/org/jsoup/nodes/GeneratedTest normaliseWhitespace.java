package org.jsoup.nodes;

public class GeneratedTest normaliseWhitespace {

    @Test
    public void test

    normaliseWhitespace() {
        // Arrange
        String text = "   hello  world";
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // Act
        TextNode normaliseWhitespace = TextNode.normaliseWhitespace(document, accum);

        // Assert
        assertTrue(normaliseWhitespace.text().equals("hello  world"));
    }

}