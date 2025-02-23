package org.jsoup.nodes;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("some text");
        boolean isBlank = textNode.isBlank();
        assertFalse(isBlank);
    }

}