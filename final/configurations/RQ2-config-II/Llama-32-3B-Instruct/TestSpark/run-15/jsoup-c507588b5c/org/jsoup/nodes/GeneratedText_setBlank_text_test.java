package org.jsoup.nodes;

public class GeneratedText_setBlank_text_test {

    @Test
    public void text_setBlank_text_test() {
        TextNode node = new TextNode("Hello");
        node.text("");
        assertTrue(node.isBlank());
    }

}