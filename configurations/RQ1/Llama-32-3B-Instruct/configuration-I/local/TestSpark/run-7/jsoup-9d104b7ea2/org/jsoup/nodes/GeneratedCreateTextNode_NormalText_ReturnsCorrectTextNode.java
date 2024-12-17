package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCreateTextNode_NormalText_ReturnsCorrectTextNode {

    @Test
    public void createTextNode_NormalText_ReturnsCorrectTextNode() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("#text", textNode.nodeName());
        assertEquals("Hello World", textNode.text());
    }

}