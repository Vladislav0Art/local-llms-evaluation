package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedTestTextNode_Constructor {

    @Test
    public void testTextNode_Constructor() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.nodeName());
    }

}