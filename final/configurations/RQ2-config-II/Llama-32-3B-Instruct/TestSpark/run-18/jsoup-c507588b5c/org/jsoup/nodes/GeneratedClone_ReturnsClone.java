package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedClone_ReturnsClone {

    @Test
    public void clone_ReturnsClone() {
        TextNode node = new TextNode("test");
        TextNode clone = node.clone();
        assertNotNull(clone);
        assertEquals("test", clone.text());
    }

}