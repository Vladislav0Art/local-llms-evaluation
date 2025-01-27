package org.jsoup.nodes;

public class GeneratedGetWholeText_ReturnsEncodedText {

    @Test
    public void getWholeText_ReturnsEncodedText() {
        // Given
        TextNode node = new TextNode("<b>Hello</b> World");

        // When
        String result = node.getWholeText();

        // Then
        assertEquals("&lt;b&gt;Hello&lt;/b&gt; World", result);
    }

}