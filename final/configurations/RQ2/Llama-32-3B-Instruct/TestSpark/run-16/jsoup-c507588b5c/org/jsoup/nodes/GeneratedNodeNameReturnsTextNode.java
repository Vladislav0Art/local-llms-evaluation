package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNodeNameReturnsTextNode {

    @Test
    public void nodeNameReturnsTextNode() {
        assertEquals(TextNode.class, new TextNode("test").nodeName());
    }

}