package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("My Text");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("My Text");
        assertEquals("My Text", textNode.text());
    }

    @Test
    public void textSetTest() {
        TextNode textNode = new TextNode("My Text");
        textNode.text("New Text");
        assertEquals("New Text", textNode.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode textNode = new TextNode("My Text");
        assertEquals("My Text", textNode.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode textNode = new TextNode(" ");
        assertEquals(true, textNode.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("My Text");
        TextNode newNode = textNode.splitText(2);
        assertEquals("My", textNode.text());
        assertEquals(" Text", newNode.text());
    }

}