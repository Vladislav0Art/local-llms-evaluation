package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.helper.Validate;

public class GeneratedTextSetTest {

    @Test
    public void textSetTest() {
        TextNode textNode = new TextNode("Hello World");
        textNode.text("New Text");
        assertEquals("New Text", textNode.text());
    }

}