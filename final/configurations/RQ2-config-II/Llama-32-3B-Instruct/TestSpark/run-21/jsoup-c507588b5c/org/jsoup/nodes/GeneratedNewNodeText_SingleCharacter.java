package org.jsoup.nodes;

public class GeneratedNewNodeText_SingleCharacter {

    @Test
    public void newNodeText_SingleCharacter() {
        TextNode node = new TextNode("a");
        assertEquals("a", node.text());
        assertFalse(node.isBlank());
    }

}