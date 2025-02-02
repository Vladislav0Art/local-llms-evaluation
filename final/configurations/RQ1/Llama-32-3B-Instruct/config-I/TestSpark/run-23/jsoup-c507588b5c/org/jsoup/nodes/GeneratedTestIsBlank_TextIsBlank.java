package org.jsoup.nodes;

public class GeneratedTestIsBlank_TextIsBlank {

    @Test
    public void testIsBlank_TextIsBlank() {
        TextNode textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

}