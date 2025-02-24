package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

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
    public void textSetTest() {
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
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("test");
        TextNode newNode = node.splitText(2);
        assertEquals("te", node.text());
        assertEquals("st", newNode.text());
    }

    @Test
    public void outerHtmlHeadTest() {
        TextNode node = new TextNode("test");
        StringBuilder accum = new StringBuilder();
        try {
            node.outerHtmlHead(accum, 0, null);
            assertEquals("test", accum.toString());
        } catch (IOException e) {
            fail();
        }
    }

    @Test
    public void outerHtmlTailTest() {
        TextNode node = new TextNode("test");
        StringBuilder accum = new StringBuilder();
        try {
            node.outerHtmlTail(accum, 0, null);
            assertEquals("", accum.toString());
        } catch (IOException e) {
            fail();
        }
    }

}