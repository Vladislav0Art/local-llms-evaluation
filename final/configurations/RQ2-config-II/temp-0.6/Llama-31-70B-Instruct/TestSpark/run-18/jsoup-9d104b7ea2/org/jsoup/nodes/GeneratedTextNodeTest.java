package org.jsoup.nodes;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTextNodeTest {

    @Test
    public void textNodeTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

}