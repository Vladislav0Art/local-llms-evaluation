package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode("hello world");
        boolean blank = textNode.isBlank();
        assertFalse(blank);
    }

}