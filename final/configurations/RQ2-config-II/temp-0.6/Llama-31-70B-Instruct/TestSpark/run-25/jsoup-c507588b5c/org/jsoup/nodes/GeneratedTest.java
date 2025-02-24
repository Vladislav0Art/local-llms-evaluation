package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("some text");
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void textTest() {
        TextNode node = new TextNode("some text");
        assertEquals("some text", node.text());
    }

    @Test
    public void textSetTest() {
        TextNode node = new TextNode("some text");
        node.text("new text");
        assertEquals("new text", node.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("some text");
        assertEquals("some text", node.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode("some text");
        assertEquals(false, node.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("some text");
        TextNode splitNode = node.splitText(2);
        assertEquals("ome text", splitNode.text());
        assertEquals("so", node.text());
    }

    @Test
    public void toStringTest() {
        TextNode node = new TextNode("some text");
        assertEquals("TextNode[some text]", node.toString());
    }

}