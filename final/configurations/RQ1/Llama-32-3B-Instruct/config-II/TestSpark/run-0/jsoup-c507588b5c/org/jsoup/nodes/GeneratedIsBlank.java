package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsBlank {

    @Test
    public void isBlank() {
        TextNode node1 = new TextNode("");
        assertTrue(node1.isBlank());

        TextNode node2 = new TextNode("\n");
        assertFalse(node2.isBlank());

        TextNode node3 = new TextNode("   ");
        assertFalse(node3.isBlank());
    }

}