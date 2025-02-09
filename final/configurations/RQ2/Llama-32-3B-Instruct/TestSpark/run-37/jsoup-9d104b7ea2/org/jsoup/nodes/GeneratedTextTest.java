package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

}