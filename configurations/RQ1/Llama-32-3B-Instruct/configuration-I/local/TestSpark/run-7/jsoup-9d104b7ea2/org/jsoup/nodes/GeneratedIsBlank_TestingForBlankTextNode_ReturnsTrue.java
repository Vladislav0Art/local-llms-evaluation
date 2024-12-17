package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsBlank_TestingForBlankTextNode_ReturnsTrue {

    @Test
    public void isBlank_TestingForBlankTextNode_ReturnsTrue() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());

        textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());

        textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

}