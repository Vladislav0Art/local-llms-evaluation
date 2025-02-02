package org.jsoup.nodes;

public class GeneratedTestToString_FieldsArePreserved {

    @Test
    public void testToString_FieldsArePreserved() {
        // Arrange
        String text = "Hello";
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        TextNode node = createFromEncoded(text);

        // Act
        String result = node.toString();

        // Assert
        assertEquals("Hello", result, "nodeToString() returned unexpected result");
    }

}