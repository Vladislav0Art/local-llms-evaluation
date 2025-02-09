package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedNewNodeTextTest {

    @Test
    public void newNodeTextTest() {
        TextNode node = new TextNode("Hello");
        assertEquals("Hello", node.text());
    }

}