package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedClone_GivenTextNode_ReturnsSameNodeType {

    @Test
    public void clone_GivenTextNode_ReturnsSameNodeType() {
        TextNode node = new TextNode("Hello World");
        TextNode clonedNode = node.clone();
        assertEquals(TextNode.class, clonedNode.getClass());
        assertEquals(node.text(), clonedNode.text());
    }

}