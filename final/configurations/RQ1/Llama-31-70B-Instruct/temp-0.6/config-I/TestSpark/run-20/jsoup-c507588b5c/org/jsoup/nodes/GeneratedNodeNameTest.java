package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNodeNameTest {

    private TextNode textNode;

    @Before
    public void before() {
        textNode = new TextNode("This is a text node");
    }

    @Test
    public void nodeNameTest() {
        assertEquals("#text", textNode.nodeName());
    }

}