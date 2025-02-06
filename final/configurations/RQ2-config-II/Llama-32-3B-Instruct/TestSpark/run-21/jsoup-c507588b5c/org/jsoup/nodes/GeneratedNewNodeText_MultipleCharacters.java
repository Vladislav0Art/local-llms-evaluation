package org.jsoup.nodes;

public class GeneratedNewNodeText_MultipleCharacters {

    @Test
    public void newNodeText_MultipleCharacters() {
        TextNode node = new TextNode("abc");
        assertEquals("abc", node.text());
        assertFalse(node.isBlank());
    }

}