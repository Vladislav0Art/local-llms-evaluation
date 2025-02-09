package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedConstructorBasicTest {

    @Test
    public void constructorBasicTest() {
        TextNode node = new TextNode("test text");
        assertNotNull(node);
        assertEquals("test text", node.text());
    }

}