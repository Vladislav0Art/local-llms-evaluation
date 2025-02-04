package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void textNodeCreationTest() {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode);
    }

    @Test
    public void nodeNameMethodTest() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void getWholeTextMethodTest() {
        TextNode textNode = new TextNode("Hello World\n");
        assertEquals("Hello World", textNode.getWholeText());
    }

    @Test
    public void isBlankMethodTest() {
        TextNode textNode1 = new TextNode("");
        assertTrue(textNode1.isBlank());

        TextNode textNode2 = new TextNode("   ");
        assertTrue(textNode2.isBlank());

        TextNode textNode3 = new TextNode("Hello World");
        assertFalse(textNode3.isBlank());
    }

    @Test
    public void splitTextMethodTest() {
        String originalText = "Hello World\n";
        int offset = 6;

        TextNode textNode = new TextNode(originalText);
        TextNode tailNode = textNode.splitText(offset);

        assertEquals(originalText.substring(0, offset), textNode.text());
        assertEquals("World", tailNode.text());
    }

    @Test
    public void outerHtmlHeadMethodTest() throws IOException {
        String originalHtml = "<div>Hello World</div>";
        Document.OutputSettings outSettings = new Document.OutputSettings(true);

        TextNode textNode = new TextNode(originalHtml);
        Appendable appendable = new StringBuilder();

        textNode.outerHtmlHead(appendable, 0, outSettings);

        assertEquals("<div><span> Hello World</span></div>", appendable.toString());
    }

    @Test
    public void outerHtmlTailMethodTest() throws IOException {
        String originalHtml = "<div>Hello World</div>";
        Document.OutputSettings outSettings = new Document.OutputSettings(true);

        TextNode textNode = new TextNode(originalHtml);
        Appendable appendable = new StringBuilder();
        int depth = 0;

        textNode.outerHtmlTail(appendable, depth, outSettings);
    }

    @Test
    public void cloneMethodTest() {
        String originalText = "Hello World";
        TextNode textNode = new TextNode(originalText);
        TextNode clonedTextNode = textNode.clone();

        assertEquals(textNode.text(), clonedTextNode.text());
    }

    @Test
    public void createFromEncodedMethodTest() throws IOException {
        String encodedText = "&lt;Hello World&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        assertEquals("Hello World", textNode.text());
    }

}