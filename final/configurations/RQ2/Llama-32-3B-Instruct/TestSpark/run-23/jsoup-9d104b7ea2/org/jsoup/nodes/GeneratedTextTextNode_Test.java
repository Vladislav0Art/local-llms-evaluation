package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedTextTextNode_Test {

    @Test
    public void textTextNode_Test() {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode.text());
    }

}