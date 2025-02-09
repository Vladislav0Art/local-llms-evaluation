package org.jsoup.nodes;

public class GeneratedText_EmptyText_ReturnsEmptyString {

    @Test
    public void text_EmptyText_ReturnsEmptyString() {
        // Given:
        TextNode node = new TextNode("");

        // When:
        String result = node.text();

        // Then:
        assertEquals("", result);
    }

}