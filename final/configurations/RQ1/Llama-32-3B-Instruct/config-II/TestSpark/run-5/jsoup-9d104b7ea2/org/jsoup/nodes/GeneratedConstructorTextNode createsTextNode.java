package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedConstructorTextNode createsTextNode {

    @Test
    public void constructorTextNode

    createsTextNode() throws IOException {
        String text = "Hello";
        TextNode node = new TextNode(text);
        assertNotNull(node);
        assertEquals(text, node.value);
    }

}