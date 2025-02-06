package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("Hello World");
        assertEquals("text", node.nodeName());
    }

}