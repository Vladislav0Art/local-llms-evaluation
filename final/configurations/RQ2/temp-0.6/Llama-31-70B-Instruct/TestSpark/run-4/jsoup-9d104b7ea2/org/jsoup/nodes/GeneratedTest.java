package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.internal.StringUtil;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("test");
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void textTest() {
        TextNode node = new TextNode("test");
        assertEquals("test", node.text());
    }

    @Test
    public void textSetterTest() {
        TextNode node = new TextNode("test");
        node.text("new text");
        assertEquals("new text", node.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("test");
        assertEquals("test", node.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode("test");
        TextNode blankNode = new TextNode("   ");
        assertFalse(node.isBlank());
        assertTrue(blankNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("test");
        TextNode splitNode = node.splitText(2);
        assertEquals("te", node.text());
        assertEquals("st", splitNode.text());
    }

}