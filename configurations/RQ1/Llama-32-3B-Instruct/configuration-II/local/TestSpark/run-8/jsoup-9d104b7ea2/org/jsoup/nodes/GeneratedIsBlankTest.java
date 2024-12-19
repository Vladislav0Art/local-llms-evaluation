package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.helper.Validate;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode textNode1 = new TextNode("");
        assertTrue(textNode1.isBlank());

        TextNode textNode2 = new TextNode("   ");
        assertTrue(textNode2.isBlank());

        TextNode textNode3 = new TextNode("Hello World");
        assertFalse(textNode3.isBlank());
    }

}