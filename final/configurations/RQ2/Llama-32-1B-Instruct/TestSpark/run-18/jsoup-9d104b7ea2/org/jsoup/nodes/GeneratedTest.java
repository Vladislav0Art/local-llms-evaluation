package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTest {

    @Before
    void setup() {
        // Set up Document for each test case
    }

    @Test
    public void testNodeName() {
        String expected = "Hello, World!";
        String actual = ((TextNode) new TextNode(expected)).nodeName();
        assertEquals(expected, actual);
    }

    @Test
    public void testText() {
        String text = "Hello, World!";
        String actual = ((TextNode) new TextNode(text)).text();
        assertEquals(text, actual);
    }

    @Test
    public void testTextNewLine() {
        String text = "\nHello, World!\n";
        String actual = ((TextNode) new TextNode(text)).text();
        assertEquals(text, actual);
    }

    @Test
    public void testGetWholeText() {
        String text = "Hello, World!";
        String actual = ((TextNode) new TextNode(text)).getWholeText();
        assertEquals(text, actual);
    }

    @Test
    public void testIsBlank() {
        boolean expected = true;
        boolean actual = ((TextNode) new TextNode("").isBlank());
        assertEquals(expected, actual);
    }

    @Test
    public void testSplitText() {
        String text = "Hello, World!";
        int length = ((TextNode) new TextNode(text)).splitText(text.length());
        assertEquals(7, length);
    }

}