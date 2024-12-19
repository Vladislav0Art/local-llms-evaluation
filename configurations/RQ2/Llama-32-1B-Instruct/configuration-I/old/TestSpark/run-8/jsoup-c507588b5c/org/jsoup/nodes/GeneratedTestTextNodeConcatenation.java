package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;

public class GeneratedTestTextNodeConcatenation {

    @Test
    public void testTextNodeConcatenation() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        StringBuilder builder = new StringBuilder();
        node.getText(builder);

        assertEquals("Hello World", builder.toString());
    }

}