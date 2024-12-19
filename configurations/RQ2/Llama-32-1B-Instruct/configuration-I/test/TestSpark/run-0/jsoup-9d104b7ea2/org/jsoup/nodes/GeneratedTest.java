package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.jsoup.select.Elements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    public DocumentOutputSettings createOutputSettings(Appendable appendable) {
        return new DocumentOutputSettings(appendable, false);
    }

    @Test
    public void testToString() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.toString());
    }

    @Test
    public void testClone() {
        TextNode node1 = new TextNode("Hello World");
        TextNode node2 = node1.clone();
        assertEquals(node1, node2);
    }

    @Test
    public void testToString() {
        TextNode node = createNode();
        assertEquals("Hello World", node.toString());
    }

    @Test
    public void testClone() {
        TextNode node1 = createNode();
        TextNode node2 = node1.clone();
        assertTrue(node1 instanceof TextNode);
        assertTrue((TextNode) node2 == node1);
    }

}