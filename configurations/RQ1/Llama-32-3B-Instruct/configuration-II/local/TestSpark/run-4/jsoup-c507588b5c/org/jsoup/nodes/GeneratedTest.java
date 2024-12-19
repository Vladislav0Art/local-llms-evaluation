package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.swing.JEditorPane;

public class GeneratedTest {

    @Test
    public void createTextNode[
    String]

    Test() {
        String testText = "Hello World";
        TextNode textNode = new TextNode(testText);
        assertEquals(testText, textNode.text());
    }

    @Test
    public void setTextNode[
    String]

    Test() {
        String testText = "Hello World";
        TextNode textNode = new TextNode("");
        textNode.text(testText);
        assertEquals(testText, textNode.text());
    }

    @Test
    public void isBlankTextNode[
    Boolean]

    Test() {
        String testText = "";
        TextNode textNode = new TextNode(testText);
        assertTrue(textNode.isBlank());

        testText = "   ";
        textNode = new TextNode(testText);
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextNode[
    Int]

    Test() {
        String testText = "Hello World";
        TextNode textNode = new TextNode(testText);

        int offset1 = 6;
        TextNode tailNode1 = textNode.splitText(offset1);
        assertEquals(testText.substring(0, offset1), tailNode1.text());
        assertEquals(testText.substring(offset1), textNode.text());

        int offset2 = 5;
        TextNode tailNode2 = textNode.splitText(offset2);
        assertEquals(testText.substring(0, offset1), tailNode1.text());
        assertEquals(testText.substring(offset1 + offset2), tailNode2.text());
    }

    @Test
    public void getWholeTextNode[
    String]

    Test() {
        String testText = "Hello World";
        TextNode textNode = new TextNode(testText);
        assertEquals(testText, textNode.getWholeText());

        testText = "";
        textNode = new TextNode(testText);
        assertNull(textNode.getWholeText());
    }

    @Test
    public void outerHtmlTextNode[
    String]

    Test() throws IOException {
        String testText = "Hello World";
        TextNode textNode = new TextNode(testText);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document.OutputSettings settings = new Document.OutputSettings(true);
        Appendable accum = new StringBuilder();

        textNode.outerHtmlHead(accum, 0, settings);
        textNode.outerHtmlTail(accum, 0, settings);

        accum.append(outContent.toString());
        assertEquals("<p>Hello World</p>", accum.toString().trim());
    }

    @Test
    public void cloneTextNode[
    TextNode]

    Test() {
        String testText = "Hello World";
        TextNode textNode = new TextNode(testText);
        TextNode clonedTextNode = textNode.clone();
        assertTrue(clonedTextNode instanceof TextNode);
        assertEquals(testText, clonedTextNode.text());
    }

    @Test
    public void createTextNodeFromEncoded[
    String]

    Test() {
        String encodedText = "&lt;Hello World&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello World", textNode.text());

        encodedText = "   ";
        textNode = TextNode.createFromEncoded(encodedText);
        assertNull(textNode.text());
    }

}