package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNodeNameTests {

    @Test
    public void nodeNameTests() {
        String text = "Hello World";
        assertEquals("text", new TextNode(text).nodeName());
    }

}