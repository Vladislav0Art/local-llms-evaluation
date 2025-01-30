package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextGetTest {

    @Test
    public void textGetTest() {
        String testString = "test    ";
        TextNode textNode = new TextNode(testString);
        assertEquals("test", textNode.text());
    }

}