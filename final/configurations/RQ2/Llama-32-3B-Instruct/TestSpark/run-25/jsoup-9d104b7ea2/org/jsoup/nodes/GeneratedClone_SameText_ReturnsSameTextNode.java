package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedClone_SameText_ReturnsSameTextNode {

    @Test
    public void clone_SameText_ReturnsSameTextNode() {
        TextNode node = new TextNode("Hello World");
        TextNode cloned = node.clone();
        assertEquals(node, cloned);
    }

}