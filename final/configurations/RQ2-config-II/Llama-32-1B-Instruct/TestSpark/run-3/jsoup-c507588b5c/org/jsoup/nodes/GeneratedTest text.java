package org.jsoup.nodes;

public class GeneratedTest text {

    @Test
    public void test

    text() {
        // Arrange
        String text = "Hello, World!";
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // Act
        String textContent = TextNode.text(document, accum);

        // Assert
        assertEquals("Hello, World!", textContent);
    }

}