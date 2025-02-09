package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void TextNodeConstructorTest() {
        TextNode node = new TextNode("Test");
        assertNotNull(node);
    }

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("#text");
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void textTest() {
        TextNode node = new TextNode("Test");
        assertEquals("Test", node.text());
    }

    @Test
    public void textResetTest() {
        TextNode node = new TextNode("Test");
        node.text("Reset");
        assertEquals("Reset", node.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("Test");
        assertEquals("Test", node.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode("  ");
        assertTrue(node.isBlank());
    }

    @Test
    public void isNotBlankTest() {
        TextNode node = new TextNode("Test");
        assertFalse(node.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("Test");
        assertEquals("Test", node.splitText(1).toString());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode node = new TextNode("Test");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlHead(accum, 1, new Document("http://test.com").outputSettings());
        assertEquals("Test", accum.toString());
    }

    @Test
    public void toStringTest() {
        TextNode node = new TextNode("Test Node");
        assertEquals("Test Node", node.toString());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("Test", false);
        assertEquals("Test", node.getWholeText());
    }

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Test");
        TextNode clone = node.clone();
        assertEquals(node.text(), clone.text());
    }

}