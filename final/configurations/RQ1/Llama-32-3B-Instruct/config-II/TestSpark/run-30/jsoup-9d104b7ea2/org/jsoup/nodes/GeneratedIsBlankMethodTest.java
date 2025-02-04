package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsBlankMethodTest {

    @Test
    public void isBlankMethodTest() {
        TextNode textNode1 = new TextNode("");
        assertTrue(textNode1.isBlank());

        TextNode textNode2 = new TextNode("   ");
        assertTrue(textNode2.isBlank());

        TextNode textNode3 = new TextNode("Hello World");
        assertFalse(textNode3.isBlank());
    }

}