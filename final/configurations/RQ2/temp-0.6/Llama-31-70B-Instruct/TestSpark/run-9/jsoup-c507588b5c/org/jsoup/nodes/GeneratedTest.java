package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void constructTextNodeTest() {
        TextNode node = new TextNode("test");
        assertEquals("test", node.text());
    }

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
    public void textUpdateTest() {
        TextNode node = new TextNode("test");
        node.text("updated");
        assertEquals("updated", node.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("test");
        assertEquals("test", node.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode("test");
        assertFalse(node.isBlank());

        TextNode node2 = new TextNode(" ");
        assertTrue(node2.isBlank());

        TextNode node3 = new TextNode("\n");
        assertTrue(node3.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("abcdef");
        TextNode splitNode = node.splitText(3);
        assertEquals("def", splitNode.text());
        assertEquals("abc", node.text());
    }

}