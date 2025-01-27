package org.jsoup.nodes;

public class GeneratedText_SpecialChars_ReturnsWithSpecialChars {

    @Test
    public void text_SpecialChars_ReturnsWithSpecialChars() {
        TextNode node = new TextNode("Hello, World!");
        assertEquals("Hello, World!", node.text());
    }

}