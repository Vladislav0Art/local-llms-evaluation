package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;

public class GeneratedIsBlankTextNode_Test {

    @Test
    public void isBlankTextNode_Test() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}