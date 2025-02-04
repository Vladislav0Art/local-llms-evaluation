package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedClone_CreateClone_ReturnsTextNode {

    @Test
    public void clone_CreateClone_ReturnsTextNode() {
        TextNode textNode = new TextNode("");
        TextNode clonedTextNode = textNode.clone();
        assertNotNull(clonedTextNode);
        assertTrue(textNode.equals(clonedTextNode));
    }

}