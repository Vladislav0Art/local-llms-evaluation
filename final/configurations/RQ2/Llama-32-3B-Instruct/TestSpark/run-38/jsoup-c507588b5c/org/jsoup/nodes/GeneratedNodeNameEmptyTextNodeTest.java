package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.io.IOException;

public class GeneratedNodeNameEmptyTextNodeTest {

    @Test
    public void nodeNameEmptyTextNodeTest() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.nodeName());
    }

}