package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedClone_ReturnsNewTextNodeWithEmptyText {

    @Test
    public void clone_ReturnsNewTextNodeWithEmptyText() {
        TextNode node = new TextNode("");
        TextNode clone = node.clone();
        assertNotNull(clone);
        assertEquals("", clone.text());
    }

}