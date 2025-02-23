package org.jsoup.nodes;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("some text");
        assertFalse(textNode.isBlank());
        textNode = new TextNode("");
        assertTrue(textNode.isBlank());
        textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
        textNode = new TextNode("\n\t");
        assertTrue(textNode.isBlank());
    }

}