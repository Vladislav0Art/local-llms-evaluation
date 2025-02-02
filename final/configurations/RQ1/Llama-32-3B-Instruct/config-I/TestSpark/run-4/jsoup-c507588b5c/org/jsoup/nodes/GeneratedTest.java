package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void createTextNode_fromEmptyString_isBlank() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void createTextNode_fromSingleChar_isNotBlank() {
        TextNode textNode = new TextNode("a");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void createTextNode_fromMultipleChars_isNotBlank() {
        TextNode textNode = new TextNode("ab");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void nodeName_returnsCorrectString() {
        TextNode textNode = new TextNode("text");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void text_returnsUnencodedText() {
        String encodedText = "&lt;&gt;";
        TextNode textNode = new TextNode(encodedText);
        String expectedText = "><";
        assertEquals(expectedText, textNode.text());
    }

    @Test
    public void text_setsCorrectValue() {
        TextNode textNode = new TextNode();
        textNode.text("newText");
        assertEquals("newText", textNode.coreValue());
    }

    @Test
    public void getWholeText_returnsUnencodedText() {
        String encodedText = "&lt;&gt;";
        TextNode textNode = new TextNode(encodedText);
        String expectedText = "><";
        assertEquals(expectedText, textNode.getWholeText());
    }

    @Test
    public void splitText_atStartReturnsCorrectNode() throws IOException {
        Document document = new Document();
        Node parentNode = document.body();
        parentNode.appendChild(new TextNode("123"));
        TextNode textNode = (TextNode) parentNode.children().get(0);
        int offset = 0;
        TextNode result = textNode.splitText(offset);
        assertEquals("1", result.coreValue());
    }

    @Test
    public void splitText_atEndReturnsBlankNode() throws IOException {
        Document document = new Document();
        Node parentNode = document.body();
        parentNode.appendChild(new TextNode(""));
        parentNode.appendChild(new TextNode("123"));
        TextNode textNode = (TextNode) parentNode.children().get(1);
        int offset = textNode.coreValue().length();
        TextNode result = textNode.splitText(offset);
        assertTrue(result.isBlank());
    }

    @Test
    public void toString_returnsOuterHtml() throws IOException {
        Document document = new Document();
        Node parentNode = document.body();
        parentNode.appendChild(new TextNode("Hello, World!"));
        parentNode.appendChild(new TextNode(" "));
        parentNode.appendChild(new TextNode(""));
        parentNode.appendChild(new TextNode("&lt;&gt;"));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        parentNode.outerHtmlHead(out, 0, Document.OutputSettings.DEFAULTS);
        assertEquals("<div>Hello, World!</div><br> <span>&lt;</span></div>", out.toString());
    }

    @Test
    public void clone_returnsCorrectTextNode() {
        TextNode textNode = new TextNode("Hello, World!");
        TextNode clonedTextNode = (TextNode) textNode.clone();
        assertEquals(textNode.coreValue(), clonedTextNode.coreValue());
    }

}