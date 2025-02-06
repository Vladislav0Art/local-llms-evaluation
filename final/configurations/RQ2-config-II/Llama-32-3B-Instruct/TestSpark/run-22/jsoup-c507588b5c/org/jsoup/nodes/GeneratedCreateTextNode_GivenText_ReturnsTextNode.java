package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCreateTextNode_GivenText_ReturnsTextNode {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertNotNull(node);
        assertEquals(text, node.text());
    }

}