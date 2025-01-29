package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedTestClone {

    public TextNode createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void testClone() {
        TextNode node1 = new TextNode("Hello");
        TextNode node2 = (TextNode) node1.clone();
        assertEquals(node1, node2);
    }

}