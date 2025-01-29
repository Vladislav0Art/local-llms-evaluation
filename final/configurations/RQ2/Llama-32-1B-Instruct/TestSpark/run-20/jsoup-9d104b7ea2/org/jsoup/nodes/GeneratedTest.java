package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNodeBuilder;
import org.junit.jupiter.api.BeforeEach;

public class GeneratedTest {

    private Document document;

    @BeforeEach
    public void setUp() {
        document = new Document();
        document.append("Hello, World!");
    }

    @Test
    public void nodeName_ReturnsTextNodeName() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals("text", node.nodeName());
    }

    @Test
    public void text_ThrowsNullPointerExceptionIfNullText() {
        try {
            new TextNode(null);
        } catch (NullPointerException e) {
            // expected behavior
        }
    }

    @Test
    public void text_SplitText_ReturnsSplitText() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals(3, node.splitText(0));
        assertEquals("Hello", node.splitText(1));
        assertEquals("", node.splitText(2));
    }

    @Test
    public void toString_ThrowsNullPointerExceptionIfNullText() {
        try {
            new TextNode(null);
        } catch (NullPointerException e) {
            // expected behavior
        }
    }

    @Test
    public void clone_ReturnsSameObject() {
        String text = "Hello, World!";
        TextNode node1 = new TextNode(text);
        TextNode node2 = new TextNode(node1);
        assertEquals(node1, node2);
    }

    @Test
    public void outerHtmlHead_ThrowsIOExceptionIfIOExceptionIsThrown() {
        Document outputSettings = document.outputSettings();
        outputSettings.setThrowOnIoErrors(true);
        try {
            new TextNode(document.toString());
        } catch (IOException e) {
            // expected behavior
        }
    }

    @Test
    public void outerHtmlTail_ThrowsIOExceptionIfIOExceptionIsThrown() {
        Document outputSettings = document.outputSettings();
        outputSettings.setThrowOnIoErrors(true);
        try {
            new TextNode(document.toString());
        } catch (IOException e) {
            // expected behavior
        }
    }

    @Test
    public void toString_ReturnsTextNodeString() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals("text", node.toString());
    }

    @Test
    public void clone_ReturnsSameObjectIfNoChangeToTextContent() {
        String text1 = "Hello, World!";
        String text2 = new TextNode(text1).clone();
        assertEquals(text1, text2);
    }

}