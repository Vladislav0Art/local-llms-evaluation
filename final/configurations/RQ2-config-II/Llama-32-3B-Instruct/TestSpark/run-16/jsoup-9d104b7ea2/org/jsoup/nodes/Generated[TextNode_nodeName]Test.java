package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

public class Generated[TextNode_nodeName]

Test {

    @Test
    public void [TextNode_nodeName]Test() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("text", textNode.nodeName());
    }

}