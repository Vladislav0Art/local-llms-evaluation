package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedClone_returnsCorrectClone {

    @Test
    public void clone_returnsCorrectClone() throws CloneNotSupportedException {
        TextNode originalTextNode = new TextNode("Hello, World!");
        TextNode clonedTextNode = originalTextNode.clone();
        assertEquals(originalTextNode, clonedTextNode);
    }

}