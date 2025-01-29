package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        TextNode node = new TextNode("");
        TextNode cloned = (TextNode) node.clone();
        assertEquals(node, cloned);
    }

}