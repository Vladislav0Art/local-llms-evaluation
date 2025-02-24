package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedTestTextNode_Text {

    @Test
    public void testTextNode_Text() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

}