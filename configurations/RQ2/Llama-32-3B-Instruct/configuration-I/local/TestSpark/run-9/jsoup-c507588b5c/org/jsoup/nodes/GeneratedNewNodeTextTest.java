package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import java.io.IOException;

public class GeneratedNewNodeTextTest {

    @Test
    public void newNodeTextTest() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.text());
    }

}