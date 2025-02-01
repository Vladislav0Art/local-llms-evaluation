package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("         Hello World           ");
        assertEquals("Hello World", textNode.text());
    }

}