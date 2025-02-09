package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        assertEquals("text='" + text + "'", textNode.toString());
    }

}