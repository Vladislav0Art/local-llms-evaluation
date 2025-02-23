package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedNodeNameTest {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("test text");
    }

    @Test
    public void nodeNameTest() {
        assertEquals("#text", textNode.nodeName());
    }

}