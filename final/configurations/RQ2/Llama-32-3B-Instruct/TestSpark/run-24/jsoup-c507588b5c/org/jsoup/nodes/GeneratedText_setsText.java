package org.jsoup.nodes;

public class GeneratedText_setsText {

    @Test
    public void text_setsText() {
        // Given
        TextNode node = new TextNode();
        node.text("Hello World");

        // When
        String result = node.text();

        // Then
        assertEquals("Hello World", result);
    }

}