package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedClone {

    @Test
    public void clone() {
        TextNode node = new TextNode("Hello");
        TextNode cloned = node.clone();
        assertNotNull(cloned);
        assertEquals("#text", cloned.nodeName());
        assertEquals("Hello", cloned.text());
    }

}