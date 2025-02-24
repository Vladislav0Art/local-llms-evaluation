package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        TextNode textNode = new TextNode("Hello world!");
        assertEquals("Hello world!", textNode.text());
    }

}