package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedClone_ClonesTextNode {

    @Test
    public void clone_ClonesTextNode() {
        TextNode node = new TextNode("text");
        TextNode cloned = node.clone();
        assertNotNull(cloned);
        assertEquals(node, cloned);
    }

}