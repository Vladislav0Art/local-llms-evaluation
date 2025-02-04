package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayBuilder;
import java.util.ArrayList;
import java.util.List;

public class GeneratedCreateTextNode_ValidText_ReturnsTextNode {

    @Test
    public void createTextNode_ValidText_ReturnsTextNode() {
        String text = "Hello World!";
        TextNode node = new TextNode(text);
        assertNotNull(node);
        assertEquals(text, node.value());
    }

}