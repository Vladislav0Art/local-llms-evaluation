package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedTextNodeConstructorTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode textNode = new TextNode("Text");
        assertEquals("Text", textNode.nodeName());
    }

}