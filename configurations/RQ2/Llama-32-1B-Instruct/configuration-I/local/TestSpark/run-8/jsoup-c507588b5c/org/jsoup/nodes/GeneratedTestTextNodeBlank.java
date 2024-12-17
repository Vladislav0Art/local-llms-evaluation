package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;

public class GeneratedTestTextNodeBlank {

    @Test
    public void testTextNodeBlank() {
        TextNode node = new TextNode("");
        assertEquals(true, node.isBlank());
    }

}