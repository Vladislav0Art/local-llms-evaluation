package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedClone_test {

    @Test
    public void clone_test() {
        TextNode node = new TextNode("Hello World");
        TextNode clonedNode = (TextNode) node.clone();
        assertEquals(node, clonedNode);
    }

}