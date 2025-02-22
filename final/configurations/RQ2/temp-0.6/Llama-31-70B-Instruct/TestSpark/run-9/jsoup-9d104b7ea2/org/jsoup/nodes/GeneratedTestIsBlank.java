package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("test");
        assertFalse(textNode.isBlank());
    }

}