package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCloneTextNodeTest {

    @Test
    public void cloneTextNodeTest() {
        TextNode node = new TextNode("Hello World");
        TextNode clone = node.clone();
        assertNotNull(clone);
        assertTrue(node.isSameNode(clone));
    }

}