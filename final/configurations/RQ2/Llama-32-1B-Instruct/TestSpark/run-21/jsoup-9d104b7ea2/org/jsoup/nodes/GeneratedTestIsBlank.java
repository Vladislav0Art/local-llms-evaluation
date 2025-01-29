package org.jsoup.nodes;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
        assertFalse(node.isBlank());
    }

}