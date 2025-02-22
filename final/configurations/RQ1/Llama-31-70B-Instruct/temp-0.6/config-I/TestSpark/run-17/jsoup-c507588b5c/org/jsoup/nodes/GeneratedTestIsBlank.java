package org.jsoup.nodes;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("text");
        assertFalse(textNode.isBlank());

        textNode = new TextNode("  ");
        assertTrue(textNode.isBlank());
    }

}