package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

}