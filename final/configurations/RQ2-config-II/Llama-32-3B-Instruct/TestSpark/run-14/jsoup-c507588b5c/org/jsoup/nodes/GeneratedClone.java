package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedClone {

    @Test
    public void clone() {
        TextNode textNode = new TextNode("test");
        TextNode result = textNode.clone();
        assertNotNull(result);
        assertEquals(textNode.text(), result.text());
    }

}