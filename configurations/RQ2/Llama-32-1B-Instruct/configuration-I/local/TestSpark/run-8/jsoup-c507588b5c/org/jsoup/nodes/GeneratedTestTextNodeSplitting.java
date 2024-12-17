package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;

public class GeneratedTestTextNodeSplitting {

    @Test
    public void testTextNodeSplitting() {
        String text = "Hello World";
        TextNode node1 = node1 = new TextNode(text);
        TextNode node2 = node2 = node1.splitText(7);

        assertEquals(text.substring(0, 7), node2.getText());
        assertEquals("World", node2.getText().substring(node1.getText().length()));
    }

}