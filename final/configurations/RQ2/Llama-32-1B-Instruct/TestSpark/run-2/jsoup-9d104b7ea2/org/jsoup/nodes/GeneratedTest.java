package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

public class GeneratedTest {

    @Test
    public void testNodeName() {
        Node node = new Document().text("Hello World");
        assertEquals("Text", node.nodeName());
    }

    @Test
    public void testText() {
        String text = "Hello World";
        TextNode node = new Document().text(text);
        assertEquals(text, node.text());
    }

    @Test
    public void testTextConcatenation() {
        Node node1 = new Document().text("Hello");
        Node node2 = new Document().text("World");
        String text = "Hello World";
        TextNode node3 = new Document().text(text);
        assertEquals(node1.text(), node3);
        assertEquals("Hello", node1.text());
    }

    @Test
    public void testGetWholeText() {
        Node node = new Document().text("Hello World");
        String text = "Hello World";
        TextNode node2 = new Document().text(text);
        assertEquals(text, node.getWholeText());
    }

    @Test
    public void testIsBlank() {
        Node node1 = new Document().text("");
        assertEquals(true, node1.isBlank());
    }

    @Test
    public void testSplitText() {
        String text = "Hello World";
        TextNode node = new Document().text(text);
        int offset = 3;
        TextNode node2 = node.splitText(offset);
        assertNotNull(node2);
        assertEquals(text.substring(0, offset), node2.text());
    }

    @Test
    public void testOuterHtmlHead() {
        Node node = new Document();
        node.outerHtmlHead(new Appendable(), 1, Document.OutputSettings.html(true));
        // Add your assertions here
    }

    @Test
    public void testOuterHtmlTail() {
        Node node = new Document();
        node.outerHtmlTail(new Appendable(), 1, Document.OutputSettings.html(true));
        // Add your assertions here
    }

}