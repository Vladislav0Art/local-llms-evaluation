package org.jsoup.nodes;

public class GeneratedText_ReturnsEncodedText {

    @Test
    public void text_ReturnsEncodedText() {
        // Given
        TextNode node = new TextNode("<b>Hello</b> World");

        // When
        String result = node.text();

        // Then
        assertEquals("&lt;b&gt;Hello&lt;/b&gt; World", result);
    }

}