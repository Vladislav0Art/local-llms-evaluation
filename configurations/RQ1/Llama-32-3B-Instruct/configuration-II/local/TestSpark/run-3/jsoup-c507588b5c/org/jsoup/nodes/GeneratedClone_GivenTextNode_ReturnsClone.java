package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedClone_GivenTextNode_ReturnsClone {

    private final TextNode node1 = new TextNode("Hello World");
    private final TextNode node2 = new TextNode("");
    private final TextNode node3 = new TextNode("\n\n");

    @Test
    public void clone_GivenTextNode_ReturnsClone() {
        TextNode cloned = node1.clone();
        assertNotNull(cloned);
        assertEquals(node1, cloned);
    }

}