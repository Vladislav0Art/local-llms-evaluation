package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedClone_returnsNewTextNodeTest {

    @Test
    public void clone_returnsNewTextNodeTest() {
        String text = "Hello World!";
        TextNode node = new TextNode(text);
        TextNode cloned = node.clone();
        assertNotNull(cloned);
        assertNotSame(node, cloned);
        assertEquals(text, cloned.text());
    }

}