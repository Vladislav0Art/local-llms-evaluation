package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedCreateTextNode_NormalText_Succeeds {

    @Test
    public void createTextNode_NormalText_Succeeds() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals("text", textNode.nodeName());
        assertEquals(text, textNode.text());
    }

}