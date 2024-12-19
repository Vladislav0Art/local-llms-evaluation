package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.helper.Validate;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("   Hello World  ");
        assertEquals("Hello World", textNode.text());
    }

}