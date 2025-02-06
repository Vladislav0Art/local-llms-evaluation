package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNewNodeTextTest {

    @Test
    public void newNodeTextTest() throws IOException {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.text());
    }

}