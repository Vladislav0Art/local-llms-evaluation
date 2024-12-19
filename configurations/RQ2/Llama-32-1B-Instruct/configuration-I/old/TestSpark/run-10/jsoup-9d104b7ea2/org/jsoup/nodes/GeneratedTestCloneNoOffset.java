package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

public class GeneratedTestCloneNoOffset {

    @Test
    public void testCloneNoOffset() {
        TextNode node = new TextNode("Hello World");
        assertEquals(node, node.clone());
    }

}