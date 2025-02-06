package org.jsoup.nodes;

public class GeneratedNewNodeText_Empty {

    @Test
    public void newNodeText_Empty() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
        assertFalse(node.isBlank());
    }

}