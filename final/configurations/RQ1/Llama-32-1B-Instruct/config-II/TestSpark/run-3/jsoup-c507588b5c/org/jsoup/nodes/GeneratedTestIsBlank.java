package org.jsoup.nodes;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        TextNode node = new TextNode("   \n\t  \n");
        assertTrue(node.isBlank());
    }

}