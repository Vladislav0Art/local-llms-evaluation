package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTextStringTest {

    @Test
    public void textStringTest() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello, World!", textNode.text(new StringBuilder()));
    }

}