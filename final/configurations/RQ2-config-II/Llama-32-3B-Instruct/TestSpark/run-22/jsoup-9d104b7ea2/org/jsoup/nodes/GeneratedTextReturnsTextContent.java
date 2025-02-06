package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTextReturnsTextContent {

    @Test
    public void textReturnsTextContent() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.text());
    }

}