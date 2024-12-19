package org.jsoup.nodes;

public class GeneratedTestTextNodeWithNullString {

    @Test
    public void testTextNodeWithNullString() {
        assertThrows(NullPointerException.class, () -> TextNode.text(null));
    }

}