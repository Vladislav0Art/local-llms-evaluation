package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

public class Generated[TextNode_text]

Test {

    @Test
    public void [TextNode_text]Test() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.text());
    }

}