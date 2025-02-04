package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

import java.io.ByteArrayOutputStream;

public class GeneratedTextMethod_ReturnsUnencodedText {

    @Test
    public void textMethod_ReturnsUnencodedText() {
        String text = "Hello\nWorld!";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello\nWorld!", textNode.text());
    }

}