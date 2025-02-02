package org.jsoup.nodes;

public class GeneratedTestIsBlankTrueIfEmpty {

    @Test
    public void testIsBlankTrueIfEmpty() {
        TextNode textNode = new TextNode(" ");
        assertTrue(textNode.isBlank());
    }

}