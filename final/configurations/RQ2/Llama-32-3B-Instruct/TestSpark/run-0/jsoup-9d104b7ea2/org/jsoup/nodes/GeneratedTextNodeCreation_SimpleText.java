package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedTextNodeCreation_SimpleText {

    @Test
    public void textNodeCreation_SimpleText() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.text());
    }

}