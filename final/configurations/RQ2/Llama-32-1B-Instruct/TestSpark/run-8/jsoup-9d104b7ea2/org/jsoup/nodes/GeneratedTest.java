package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testToString() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.toString());
    }

    @Test
    public void testTextEquals() {
        TextNode node1 = new TextNode("Hello World");
        TextNode node2 = new TextNode("Hello World");
        assertEquals(node1, node2);
        assertEquals(0L, node1.text().length(), 10); // Assuming the length of "Hello World" is 11
    }

    @Test
    public void testTextNotEquals() {
        TextNode node1 = new TextNode("Hello World");
        TextNode node2 = new TextNode("Hello Universe");
        assertEquals(node1, node2);
        assertEquals(0L, node1.text().length(), 10); // Assuming the length of "Hello World" is 11
    }

    @Test
    public void testTextContain() {
        TextNode node = new TextNode("Hello World");
        assertEquals(true, node.text().contains("World"));
    }

    @Test
    public void testTextStartWith() {
        TextNode node = new TextNode("Hello ");
        assertEquals(true, node.text().startsWith("Hello "));
    }

}