package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTextNodeCreationTest {

    @Test
    public void textNodeCreationTest() {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode);
    }

}