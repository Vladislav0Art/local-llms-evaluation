package org.jsoup.nodes;

public class GeneratedText_notnull_returnsCorrectText {

    @Test
    public void text_notnull_returnsCorrectText() {
        String text = new TextNode("test").text();
        assertEquals("test", text);
    }

}