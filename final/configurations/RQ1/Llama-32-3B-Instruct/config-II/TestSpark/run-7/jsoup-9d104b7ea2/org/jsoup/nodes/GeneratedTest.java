package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

import java.io.IOException;

import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void textNode_creation_test() {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode);
    }

    @Test
    public void nodeName_test() {
        TextNode textNode = new TextNode("");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void text_test() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.text().trim());
    }

    @Test
    public void text_setter_test() {
        TextNode textNode = new TextNode("");
        textNode.text("New Text");
        assertEquals("New Text", textNode.text().trim());
    }

    @Test
    public void isBlank_test() {
        TextNode textNode1 = new TextNode(" ");
        assertTrue(textNode1.isBlank());

        TextNode textNode2 = new TextNode("");
        assertTrue(textNode2.isBlank());

        TextNode textNode3 = new TextNode("Hello World");
        assertFalse(textNode3.isBlank());
    }

    @Test
    public void splitText_test() {
        TextNode textNode = new TextNode("Hello World");
        TextNode result1 = textNode.splitText(0);
        assertEquals("Hello World", result1.getWholeText());

        TextNode result2 = textNode.splitText(6);
        assertEquals("World", result2.getWholeText());
    }

    @Test
    public void outerHtmlHead_test() throws IOException {
        Document document = new Document();
        Element parent = new Element("div");
        parent.appendChild(document);

        when(parentNode).thenReturn(parent);
        when(parentTag()).thenReturn(new Element("div"));

        TextNode textNode = new TextNode("Hello World");
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();

        textNode.outerHtmlHead(accum, depth, out);

        assertEquals("<div>Hello World</div>", accum.toString());
    }

    @Test
    public void toString_test() throws IOException {
        Document document = new Document();
        Element parent = new Element("div");
        parent.appendChild(document);

        when(parentNode).thenReturn(parent);
        when(parentTag()).thenReturn(new Element("div"));

        TextNode textNode = new TextNode("Hello World");
        assertEquals("<div>Hello World</div>", textNode.toString());
    }

    @Test
    public void clone_test() {
        TextNode originalText = new TextNode("Hello World");
        TextNode clonedText = (TextNode) originalText.clone();

        assertNotNull(clonedText);
        assertEquals(originalText.text().trim(), clonedText.text().trim());
    }

}