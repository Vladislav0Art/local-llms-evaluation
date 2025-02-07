package org.jsoup.nodes;

public class GeneratedTest toString {

    @Test
    public void test

    toString() {
        // Arrange
        String text = "Hello, World!";
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // Act
        String textContent = TextNode.toString(document, accum);

        // Assert
        assertEquals("HTML", textContent);
    }

}