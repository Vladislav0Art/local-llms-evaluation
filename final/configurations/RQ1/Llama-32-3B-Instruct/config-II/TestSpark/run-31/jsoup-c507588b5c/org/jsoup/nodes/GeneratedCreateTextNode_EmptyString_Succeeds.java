package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedCreateTextNode_EmptyString_Succeeds {

    @Test
    public void createTextNode_EmptyString_Succeeds() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertEquals("text", textNode.nodeName());
        assertEquals("", textNode.text());
    }

}