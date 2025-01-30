package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextPlainConstructorTest {

    @Test
    public void textPlainConstructorTest() {
        TextNode textNode = new TextNode("Text Node Test");
        assertEquals("#text", textNode.nodeName());
        assertEquals("Text Node Test", textNode.text());
    }

}