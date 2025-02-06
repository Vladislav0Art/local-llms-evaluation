package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    @Test
    public void text() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.text());
    }

    @Test
    public void textNoText() {
        TextNode node = new TextNode("");
        assertNull(node.text());
    }

    @Test
    public void textTrimmed() {
        TextNode node = new TextNode("\t\nHello World\t\n");
        assertEquals("Hello World", StringUtil.trim(node.text()));
    }

    @Test
    public void splitText() {
        TextNode node = new TextNode("Hello World");
        TextNode result1 = (TextNode) node.splitText(0);
        assertEquals("Hello", result1.text());
        assertEquals("World", ((TextNode) node.splitText(result1.length())).text());

        TextNode result2 = (TextNode) node.splitText(6);
        assertNull(result2);
    }

    @Test
    public void splitTextOffset() {
        TextNode node = new TextNode("Hello World");
        TextNode result1 = (TextNode) node.splitText(5);
        assertEquals("World", result1.text());

        TextNode result2 = (TextNode) node.splitText(10);
        assertNull(result2);

        TextNode result3 = (TextNode) node.splitText(node.length());
        assertNull(result3);
    }

    @Test
    public void nodeName() {
        TextNode node = new TextNode("Hello World");
        assertEquals("text", node.nodeName());
    }

    @Test
    public void getWholeText() {
        TextNode node = new TextNode("Hello\nWorld");
        assertEquals("Hello\nWorld", node.getWholeText());
    }

    @Test
    public void isBlank() {
        TextNode node1 = new TextNode("");
        assertTrue(node1.isBlank());

        TextNode node2 = new TextNode("   ");
        assertTrue(node2.isBlank());

        TextNode node3 = new TextNode("Hello");
        assertFalse(node3.isBlank());
    }

    @Test
    public void clone() {
        TextNode node = new TextNode("Hello World");
        TextNode clone = (TextNode) node.clone();
        assertEquals("Hello World", clone.text());
    }

    @Test
    public void outerHtmlHead() {
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        Document.OutputSettings settings = new Document.OutputSettings();

        Element html = new Element("html");
        html.appendChild(new TextNode("Hello"));
        html.appendChild(new TextNode("<br/>"));

        html.outerHtmlHead(ba, 0, settings);
        assertEquals("<html>Hello<br/>", ba.toString());
    }

    @Test
    public void outerHtmlTail() {
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        Document.OutputSettings settings = new Document.OutputSettings();

        Element html = new Element("html");
        html.appendChild(new TextNode("Hello"));
        html.appendChild(new TextNode("<br/>"));

        html.outerHtmlTail(ba, 0, settings);
        assertEquals("</html>Hello<br/>", ba.toString());
    }

    @Test
    public void outerHtmlHeadEmpty() {
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        Document.OutputSettings settings = new Document.OutputSettings();

        Element html = new Element("html");

        html.outerHtmlHead(ba, 0, settings);
        assertEquals("", ba.toString());
    }

    @Test
    public void outerHtmlTailEmpty() {
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        Document.OutputSettings settings = new Document.OutputSettings();

        Element html = new Element("html");

        html.outerHtmlTail(ba, 0, settings);
        assertEquals("", ba.toString());
    }

    @Test
    public void toString() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.toString());
    }

}