package org.jsoup.nodes;

public class GeneratedTextNode_textNull_ThrowsIllegalArgumentException {

    @Test
    public void textNode_textNull_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new TextNode(null));
    }

}