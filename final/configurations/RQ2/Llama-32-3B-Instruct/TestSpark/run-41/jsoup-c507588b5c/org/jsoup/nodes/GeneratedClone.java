package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.io.IOException;

public class GeneratedClone {

    @Test
    public void clone() {
        TextNode textNode = new TextNode("test");
        TextNode cloned = textNode.clone();
        assertEquals(textNode, cloned);
    }

}