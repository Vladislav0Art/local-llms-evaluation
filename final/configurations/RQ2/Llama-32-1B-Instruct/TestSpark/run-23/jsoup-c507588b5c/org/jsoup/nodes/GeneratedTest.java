package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testnodeName() {
        // Create an instance of the TextNode class
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals("text", node.nodeName());
    }

    @Test
    public void testText() {
        // Create an instance of the TextNode class with a text string
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals("Hello, World!", node.text());
    }

    @Test
    public void testText_noBlank() {
        // Create an instance of the TextNode class with a non-blank text string
        String text = "Hello, World!  ";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());
    }

    @Test
    public void testGetWholeText() {
        // Create an instance of the TextNode class
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals("Hello, World!", node.getWholeText());
    }

    @Test
    public void testIsBlank() {
        // Create an instance of the TextNode class with a blank string
        String text = "";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());
    }

    @Test
    public void testSplitText() {
        // Create an instance of the TextNode class
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals("Hello, World!", node.splitText(6));
    }

    @Test
    public void testOuterHtmlHead() {
        // Create an instance of the TextNode class
        String text = "<p>Hello, World!</p>";
        TextNode node = new TextNode(text);
        assertEquals("<p>", node.outerHtmlHead(null, 0, null));
        // Add some more tests for this method to maximize line coverage
    }

    @Test
    public void testOuterHtmlTail() {
        // Create an instance of the TextNode class
        String text = "<p>Hello, World!</p>";
        TextNode node = new TextNode(text);
        assertEquals("<p>", node.outerHtmlHead(null, 0, null));
        assertEquals("</p>", node.outerHtmlTail(null, 0, null));
    }

    @Test
    public void testToString() {
        // Create an instance of the TextNode class
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals("TextNode {nodeName='text'}", node.toString());
    }

    @Test
    public void testClone() {
        // Create an instance of the TextNode class
        String text = "Hello, World!";
        TextNode node1 = new TextNode(text);
        TextNode node2 = node1.clone();
        assertEquals(node1, node2);
    }

    @Test
    public void testCreateFromEncoded() {
        // Create an encoded string representing a text node
        String encodedText = "<text>Hello, World!</text>";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello, World!", node.text());
    }

}