package org.jsoup.nodes;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        TextNode node = new TextNode("");
        assertFalse(node.isBlank());
        assertFalse(new TextNode(" ").isBlank());
    }

}