package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlank {

    @Test
    public void isBlank() {
        TextNode textNode = new TextNode("   \n");
        assertTrue(textNode.isBlank());
    }

}