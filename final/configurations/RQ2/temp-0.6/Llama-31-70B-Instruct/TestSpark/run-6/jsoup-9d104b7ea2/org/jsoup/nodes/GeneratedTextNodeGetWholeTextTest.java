package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeGetWholeTextTest {

    @Test
    public void textNodeGetWholeTextTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.getWholeText());
    }

}