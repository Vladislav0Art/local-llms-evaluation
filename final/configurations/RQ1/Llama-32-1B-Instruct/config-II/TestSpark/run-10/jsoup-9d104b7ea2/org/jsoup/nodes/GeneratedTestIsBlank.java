package org.jsoup.nodes;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        TextNode node = new TextNode("   ");
        assertTrue(node.isBlank());
        TextNode node2 = new TextNode("Hello");
        assertFalse(node2.isBlank());
    }

}