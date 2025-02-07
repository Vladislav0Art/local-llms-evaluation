package org.jsoup.nodes;

public class GeneratedTest isBlank {

    @Test
    public void test

    isBlank() {
        // Arrange
        String text = "   Hello  World";
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // Act
        boolean blank = TextNode.isBlank(document, accum);

        // Assert
        assertTrue(blank);
    }

}