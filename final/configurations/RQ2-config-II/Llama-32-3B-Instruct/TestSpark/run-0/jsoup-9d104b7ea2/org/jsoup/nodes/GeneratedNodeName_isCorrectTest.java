package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedNodeName_isCorrectTest {

    @Test
    public void nodeName_isCorrectTest() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals("text", textNode.nodeName());
    }

}