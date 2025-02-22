package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestNodeName {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("This is a text node");
    }

    @Test
    public void testNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

}