package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGetWholeTextMethodTest {

    @Test
    public void getWholeTextMethodTest() {
        TextNode textNode = new TextNode("Hello World\n");
        assertEquals("Hello World", textNode.getWholeText());
    }

}