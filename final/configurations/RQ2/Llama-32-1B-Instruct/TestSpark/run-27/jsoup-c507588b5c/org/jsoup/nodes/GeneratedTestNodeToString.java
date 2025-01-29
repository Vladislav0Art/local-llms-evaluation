package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestNodeToString {

    @Test
    public void testNodeToString() {
        Node root = new Root();
        String expected = "<div id=\"root\" class=\"container\">";
        assertEquals(expected, root.toString());
    }

}