package org.jsoup.nodes;

public class GeneratedTest stripLeadingWhitespace {

    @Test
    public void test

    stripLeadingWhitespace() {
        // Arrange
        String text = "   hello  world";
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // Act
        TextNode stripLeadingWhitespace = TextNode.stripLeadingWhitespace(document, accum);

        // Assert
        assertTrue(stripLeadingWhitespace.text().equals("hello  world"));
    }

}