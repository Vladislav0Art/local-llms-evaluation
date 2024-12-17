package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;

public class GeneratedNodeNameNotEmptyTextTest {

    @Test
    public void nodeNameNotEmptyTextTest() {
        TextNode node = new TextNode("Hello");
        assertEquals("text", node.nodeName());
    }

}