package org.jsoup.nodes;

public class GeneratedText_MultipleCharactersText_ReturnsMultipleCharactersText {

    @Test
    public void text_MultipleCharactersText_ReturnsMultipleCharactersText() {
        // Given:
        TextNode node = new TextNode("hello");

        // When:
        String result = node.text();

        // Then:
        assertEquals("hello", result);
    }

}