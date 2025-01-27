package org.jsoup.nodes;

public class GeneratedText_null_throwsException {

    @Test
    public void text_null_throwsException() {
        assertThrows(NullPointerException.class, () -> new TextNode().text());
    }

}