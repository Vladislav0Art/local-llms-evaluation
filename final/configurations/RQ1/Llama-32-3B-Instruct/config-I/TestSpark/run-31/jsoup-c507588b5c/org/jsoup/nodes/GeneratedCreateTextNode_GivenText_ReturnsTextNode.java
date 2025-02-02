package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedCreateTextNode_GivenText_ReturnsTextNode {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() throws IOException {
        String text = "Hello World";
        TextNode textNode = new Node(text);
        assertNotNull(textNode);
    }

    public static class Node extends TextNode {
        public Node(String text) {
            super(text);
        }
    }

}