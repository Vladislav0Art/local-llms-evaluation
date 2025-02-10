package org.jsoup.nodes;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        // Given
        String text = "Hello World!";
        Document document = new Document();
        Appendable appendable = new StringBuilder();

        // When
        TextNode node = textNodeFromText(text, document);
        String result = node.toString();

        // Then
        Assert.assertNotNull(result);
    }

}