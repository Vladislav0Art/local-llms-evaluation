package org.jsoup.nodes;

public class GeneratedTest splitText {

    @Test
    public void test

    splitText() {
        // Arrange
        String text = "Hello   World";
        Document document = new Document();
        Appendable accum1 = new StringBuilder();
        Appendable accum2 = new StringBuilder();

        // Act
        TextNode splitText = TextNode.splitText(document, 3);

        // Assert
        assertTrue(splitText.text(0).equals("Hello"));
        assertTrue(splitText.text(1).equals("   "));
        assertTrue(splitText.text(2).equals("World"));
    }

}