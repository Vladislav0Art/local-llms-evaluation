package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.io.IOException;

public class GeneratedNewNodeTextTest {

    @Test
    public void newNodeTextTest() {
        TextNode textNode = new TextNode("Hello, World!");
        assertEquals("Hello, World!", textNode.text());
    }

}