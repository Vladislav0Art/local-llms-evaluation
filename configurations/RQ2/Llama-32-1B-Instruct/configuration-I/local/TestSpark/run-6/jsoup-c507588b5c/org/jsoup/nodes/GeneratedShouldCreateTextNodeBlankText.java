package org.jsoup.nodes;

public class GeneratedShouldCreateTextNodeBlankText {

    @Test
    public void shouldCreateTextNodeBlankText() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.text());
    }

}