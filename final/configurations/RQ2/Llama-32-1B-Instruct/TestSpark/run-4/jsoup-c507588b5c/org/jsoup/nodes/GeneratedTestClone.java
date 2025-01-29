package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        TextNode node = new TextNode("test");
        TextNode clone = node.clone();
        assertNotNull(clone);
        assertEquals(node, clone);
    }

}