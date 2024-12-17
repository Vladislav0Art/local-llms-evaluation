package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedClone_ReturnsCorrectTextNode {

    @Test
    public void clone_ReturnsCorrectTextNode() {
        TextNode original = new TextNode("Hello");
        TextNode cloned = original.clone();
        assertTrue(original.equals(cloned));
    }

}