package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.helper.Validate;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Hello World");
        TextNode tailNode = textNode.splitText(6);
        assertEquals("World", tailNode.text());
        assertNull(tailNode.nextSibling());
    }

}