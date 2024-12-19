package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;

public class GeneratedNodeNameEmptyTextTest {

    @Test
    public void nodeNameEmptyTextTest() {
        TextNode node = new TextNode("");
        assertEquals("", node.nodeName());
    }

}