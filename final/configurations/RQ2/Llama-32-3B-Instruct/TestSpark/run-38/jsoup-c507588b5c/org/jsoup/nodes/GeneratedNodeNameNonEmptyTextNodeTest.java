package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.io.IOException;

public class GeneratedNodeNameNonEmptyTextNodeTest {

    @Test
    public void nodeNameNonEmptyTextNodeTest() {
        TextNode textNode = new TextNode("Hello, World!");
        assertEquals("text", textNode.nodeName());
    }

}