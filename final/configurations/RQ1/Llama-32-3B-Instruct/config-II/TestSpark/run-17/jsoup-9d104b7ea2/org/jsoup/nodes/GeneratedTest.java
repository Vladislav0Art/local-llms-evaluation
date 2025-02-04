package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GeneratedTest {

    public Node createTextNode(String text) {
        Document doc = new Document();
        Element parent = doc.createElement("root");
        doc.appendChild(parent);
        return doc.body().append(text).firstChild();
    }

    @Test
    public void createTextNode_fromEmptyText_shouldReturnBlankTextNode() {
        TextNode node = TextNode.createFromEncoded("");
        assertTrue(node.isBlank());
    }

    @Test
    public void createTextNode_fromNonEmptyText_shouldReturnNonBlankTextNode() {
        String text = "   ";
        TextNode node = TextNode.createFromEncoded(text);
        assertFalse(node.isBlank());
    }

    @Test
    public void text_ofTextNode_isCorrectlyCalculated() {
        String text = "   ";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

    @Test
    public void splitText_atOffset_shouldSplitTextCorrectly() {
        String text = "Hello";
        int offset = 5;
        ArrayList<TextNode> nodes = new ArrayList<>();
        TextNode parent = createTextNode(text);
        TextNode node1 = createTextNode("H");
        parent.appendChild(node1);
        TextNode node2 = createTextNode(text.substring(offset));
        parent.appendChild(node2);

        TextNode result = parent.splitText(offset);
        assertEquals(5, result.text().length());
        assertTrue(result.isBlank());
    }

    @Test
    public void splitText_atOffset_afterBlank_shouldKeepBlankAsWhole() {
        String text = "   ";
        int offset = 1;
        ArrayList<TextNode> nodes = new ArrayList<>();
        TextNode parent = createTextNode(text);
        TextNode node1 = createTextNode("");
        parent.appendChild(node1);
        TextNode node2 = createTextNode(text.substring(offset));
        parent.appendChild(node2);

        TextNode result = parent.splitText(offset);
        assertEquals(0, result.text().length());
    }

    @Test
    public void outerHtml_head_shouldNotIncludeEmptyTextNode() {
        String text = "   ";
        TextNode node = new TextNode(text);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document doc = new Document();
        doc.body().append(node).firstChild();
        doc.outerHtmlHead(out, 0, null);
        assertTrue(!out.toString().contains("<br>"));
    }

    @Test
    public void outerHtml_head_shouldIncludeTextNodeWithNewlinesAndSpaces() {
        String text = "   ";
        TextNode node = new TextNode(text);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document doc = new Document();
        doc.body().append(node).firstChild();
        doc.outerHtmlHead(out, 0, null);
        assertTrue(out.toString().contains("\n"));
    }

    @Test
    public void outerHtml_tail_shouldNotIncludeEmptyTextNode() {
        String text = "   ";
        TextNode node = new TextNode(text);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document doc = new Document();
        doc.body().append(node).firstChild();
        doc.outerHtmlTail(out, 0, null);
        assertTrue(!out.toString());
    }

    @Test
    public void outerHtml_tail_shouldIncludeTextNodeWithNewlinesAndSpaces() {
        String text = "   ";
        TextNode node = new TextNode(text);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document doc = new Document();
        doc.body().append(node).firstChild();
        doc.outerHtmlTail(out, 0, null);
        assertTrue(out.toString().contains("\n"));
    }

    @Test
    public void clone_shouldReturnNewTextNode() {
        String text = "   ";
        TextNode node = new TextNode(text);
        TextNode result = node.clone();
        assertFalse(result.text().equals(node.text()));
    }

    @Test
    public void createFromEncoded_shouldCreateTextNodeCorrectly() {
        String encodedText = "&lt;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals(encodedText, node.text());
    }

}