package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;

public class GeneratedCloneTextEqualsOriginalTest {

    @Test
    public void cloneTextEqualsOriginalTest() {
        TextNode node1 = new TextNode("Hello");
        TextNode node2 = node1.clone();
        assertEquals(node1, node2);
    }

}