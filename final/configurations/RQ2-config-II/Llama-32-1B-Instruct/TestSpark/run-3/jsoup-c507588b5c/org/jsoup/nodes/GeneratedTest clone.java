package org.jsoup.nodes;

public class GeneratedTest clone {

    @Test
    public void test

    clone() {
        // Arrange
        String text = "Hello, World!";
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // Act
        TextNode cloned = TextNode.clone(document, accum);

        // Assert
        assertTrue(cloned.text("Hello, World!").equals(text));
    }

}