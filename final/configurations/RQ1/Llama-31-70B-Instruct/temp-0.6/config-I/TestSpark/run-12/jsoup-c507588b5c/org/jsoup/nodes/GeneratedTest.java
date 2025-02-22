package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("This is a text node");
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void textTest() {
        TextNode node = new TextNode("This is a text node");
        assertEquals("This is a text node", node.text());
    }

    @Test
    public void textWithMockTest() {
        TextNode node = Mockito.mock(TextNode.class);
        Mockito.when(node.text()).thenReturn("This is a text node");
        assertEquals("This is a text node", node.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("This is a text node");
        assertEquals("This is a text node", node.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("This is a text node");
        TextNode splitNode = node.splitText(5);
        assertEquals("This ", node.getWholeText());
        assertEquals("is a text node", splitNode.getWholeText());
    }

}