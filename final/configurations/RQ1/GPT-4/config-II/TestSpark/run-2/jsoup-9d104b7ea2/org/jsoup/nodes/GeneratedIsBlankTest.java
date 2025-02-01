package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode blankTextNode = new TextNode("       \n       ");
        assertTrue(blankTextNode.isBlank());
        TextNode textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

}