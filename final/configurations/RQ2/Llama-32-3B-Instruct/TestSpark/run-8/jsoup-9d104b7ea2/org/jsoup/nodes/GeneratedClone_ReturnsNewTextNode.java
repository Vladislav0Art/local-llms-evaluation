package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedClone_ReturnsNewTextNode {

    @Test
    public void clone_ReturnsNewTextNode() {
        TextNode original = new TextNode("Hello World");
        TextNode clone = original.clone();
        assertNotNull(clone);
        assertNotSame(original, clone);
        assertEquals("Hello World", clone.text());
    }

}