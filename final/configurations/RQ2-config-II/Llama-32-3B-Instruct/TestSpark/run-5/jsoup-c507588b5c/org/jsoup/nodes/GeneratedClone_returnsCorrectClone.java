package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedClone_returnsCorrectClone {

    @Test
    public void clone_returnsCorrectClone() {
        TextNode node = new TextNode("text");
        TextNode cloned = node.clone();
        assertNotNull(cloned);
        assertEquals(node.text(), cloned.text());
    }

}