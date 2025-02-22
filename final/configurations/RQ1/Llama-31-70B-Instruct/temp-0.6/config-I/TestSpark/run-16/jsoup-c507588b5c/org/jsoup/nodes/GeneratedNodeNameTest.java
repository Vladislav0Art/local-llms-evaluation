package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedNodeNameTest {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("Test");
    }

    @After
    public void tearDown() {
        textNode = null;
    }

    @Test
    public void nodeNameTest() {
        assertEquals("#text", textNode.nodeName());
    }

}