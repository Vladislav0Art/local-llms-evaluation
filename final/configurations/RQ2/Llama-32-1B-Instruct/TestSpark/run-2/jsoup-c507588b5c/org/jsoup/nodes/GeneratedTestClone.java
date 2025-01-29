package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        TextNode node1 = new TextNode("Hello");
        TextNode node2 = node1.clone();
        assertEquals(node1, node2);
    }

}