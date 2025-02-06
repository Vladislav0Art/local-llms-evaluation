package org.jsoup.nodes;

public class GeneratedText_NullText_ThrowsNullPointerException {

    @Test
    public void text_NullText_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new TextNode(null).text());
    }

}