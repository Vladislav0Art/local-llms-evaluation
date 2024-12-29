package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedNodeName_TextNodeName {

    @Test
    public void nodeName_TextNodeName() {
        TextNode node = new TextNode("test");
        assertEquals("text", node.nodeName());
    }

}