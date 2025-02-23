package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTestConstructor {

    @Test
    public void testConstructor() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.coreValue());
    }

}