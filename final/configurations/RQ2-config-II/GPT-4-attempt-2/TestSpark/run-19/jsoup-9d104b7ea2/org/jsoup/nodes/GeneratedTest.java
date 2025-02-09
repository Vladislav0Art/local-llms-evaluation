package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("textNode");
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void textTest() {
        TextNode node = new TextNode("textNode");
        assertEquals("textNode", node.text());
    }

    @Test
    public void textChangeTest() {
        TextNode node = new TextNode("textNode");
        node.text("newTextNode");
        assertEquals("newTextNode", node.text());
    }

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("wholeText");
        assertEquals("wholeText", node.getWholeText());
    }

    @Test
    public void isBlankTestTrue() {
        TextNode node = new TextNode(" ");
        assertTrue(node.isBlank());
    }

    @Test
    public void isBlankTestFalse() {
        TextNode node = new TextNode("not blank");
        assertFalse(node.isBlank());
    }

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("splitText");
        TextNode splitNode = node.splitText(4);
        assertEquals("split", node.getWholeText());
        assertEquals("Text", splitNode.getWholeText());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode node = new TextNode("textNode");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        node.outerHtmlHead(accum, 0, out);
        assertEquals("textNode", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode node = new TextNode("textNode");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        node.outerHtmlTail(accum, 0, out);
        assertEquals("", accum.toString());
    }

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("toClone");
        TextNode cloneNode = node.clone();
        assertNotSame(node, cloneNode);
        assertEquals(node.getWholeText(), cloneNode.getWholeText());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("&lt;p&gt;Paragraphe.&lt;/p&gt;", false);
        assertEquals("<p>Paragraphe.</p>", node.getWholeText());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String textWithWhitespace = " normalize   whitespace ";
        assertEquals(" normalize whitespace ", TextNode.normaliseWhitespace(textWithWhitespace));
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String textWithWhitespace = "   strip leading whitespace";
        assertEquals("strip leading whitespace", TextNode.stripLeadingWhitespace(textWithWhitespace));
    }

    @Test
    public void lastCharIsWhitespaceTestTrue() {
        StringBuilder sb = new StringBuilder("lastCharIsWhitespace ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void lastCharIsWhitespaceTestFalse() {
        StringBuilder sb = new StringBuilder("lastCharIsWhitespace");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}