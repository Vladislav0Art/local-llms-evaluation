package org.jsoup.nodes;

public class GeneratedTest textWithSpaces {

    @Test
    public void test

    textWithSpaces() {
        // Arrange
        String text = " Hello   World";
        Document document = new Document();
        Appendable accum = new StringBuilder();

        // Act
        String textContent = TextNode.text(document, accum);

        // Assert
        assertEquals("Hello  World", textContent);
    }

}