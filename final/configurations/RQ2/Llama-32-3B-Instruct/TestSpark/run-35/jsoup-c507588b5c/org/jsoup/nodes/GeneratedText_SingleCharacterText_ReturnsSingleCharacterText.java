package org.jsoup.nodes;

public class GeneratedText_SingleCharacterText_ReturnsSingleCharacterText {

    @Test
    public void text_SingleCharacterText_ReturnsSingleCharacterText() {
        // Given:
        TextNode node = new TextNode("a");

        // When:
        String result = node.text();

        // Then:
        assertEquals("a", result);
    }

}