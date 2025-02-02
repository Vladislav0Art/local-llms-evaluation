package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedConstructorTextTest {

    @Test
    public void constructorTextTest() {
        TextNode node = new TextNode("Hello World");
        assertNotNull(node.value);
        assertEquals("Hello World", node.value);
    }

}