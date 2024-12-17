package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;

public class GeneratedCloneTextDifferentNodeTest {

    @Test
    public void cloneTextDifferentNodeTest() {
        TextNode node1 = new TextNode("Hello");
        TextNode node2 = new TextNode("");
        TextNode cloned = node1.clone();
        assertNotSame(cloned, node2);
    }

}