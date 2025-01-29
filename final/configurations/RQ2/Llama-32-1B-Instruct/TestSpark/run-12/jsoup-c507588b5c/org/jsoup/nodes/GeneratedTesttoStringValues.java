package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTesttoStringValues {

    @Test
    public void testtoStringValues() {
        assertEquals("TEXT_NODE", new TextNode("").toString());
        assertEquals("TEXT_NODE", new TextNode(new String[]{}).toString());
        assertEquals("TEXT_NODE", new TextNode(null).toString());
    }

}