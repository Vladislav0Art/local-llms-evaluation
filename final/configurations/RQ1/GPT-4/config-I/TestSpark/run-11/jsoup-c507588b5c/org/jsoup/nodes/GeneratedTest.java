package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nodeNamdTest() {
        TextNode node = new TextNode("");
        assertEquals(node.nodeName(), "#text");
    }

    @Test
    public void getWholeTextTest() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals(node.getWholeText(), text);
    }

    @Test
    public void isBlankNotEmptyTest() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertFalse(node.isBlank());
    }

    @Test
    public void isBlankEmptyTest() {
        String text = " ";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());
    }

    @Test
    public void splitTextTest() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        TextNode split = node.splitText(7);
        assertEquals(node.getWholeText(), "Hello, ");
        assertEquals(split.getWholeText(), "World!");
    }

    @Test
    public void splitTextOffsetNegativeTest() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        node.splitText(-7);
    }

    @Test
    public void splitTextOffsetExceedsLengthTest() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        node.splitText(100);
    }

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("Hello, World!");
        TextNode clone = node.clone();
        assertEquals(node.getWholeText(), clone.getWholeText());
        assertNotSame(node, clone);
    }

    @Test
    public void createFromEncodedTest() {
        String text = "Hello, World!";
        TextNode node = TextNode.createFromEncoded(text);
        assertEquals(node.getWholeText(), "Hello, World!");
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        outputSettings.prettyPrint(true);

        node.outerHtmlHead(sb, 0, outputSettings);
        assertEquals("Hello, World!", sb.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        outputSettings.prettyPrint(true);

        node.outerHtmlTail(sb, 0, outputSettings);
        assertEquals("", sb.toString());
    }

    @Test
    public void textTest() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals(node.text(), "Hello, World!");

        TextNode changedNode = node.text("Changed text");
        assertEquals(changedNode.text(), "Changed text");
    }

}