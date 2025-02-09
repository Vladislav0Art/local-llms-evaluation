package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedClone_ReturnsNewTextNode {

    @Test
    public void clone_ReturnsNewTextNode() {
        TextNode node = new TextNode("Hello World");
        TextNode clone = node.clone();
        assertNotNull(clone);
        assertEquals(node.text(), clone.text());
    }

}