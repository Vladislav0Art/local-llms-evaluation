package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode);
    }

    @Test
    public void nodeName_GettingNodeName_ReturnsCorrectValue() throws Exception {
        TextNode textNode = new TextNode("");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void text_GettingTextContent_ReturnsEncodedText() throws Exception {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("", textNode.text());
    }

    @Test
    public void setWholeText_SettingWholeText_ReturnsTextNode() throws Exception {
        TextNode textNode = new TextNode("");
        textNode.setWholeText("Hello World");
        assertEquals("Hello World", textNode.getWholeText());
        return;
    }

    @Test
    public void isBlank_TestingIsBlank_ReturnsTrueForBlankNodes() throws Exception {
        TextNode textNode1 = new TextNode("");
        assertTrue(textNode1.isBlank());

        TextNode textNode2 = new TextNode("   ");
        assertTrue(textNode2.isBlank());
    }

    @Test
    public void splitText_SplittingTextNode_ReturnsNewTextNode() throws Exception {
        TextNode textNode = new TextNode("Hello World");
        TextNode newTextNode = textNode.splitText(7);
        assertEquals("Hello", newTextNode.getWholeText());
    }

    @Test
    public void outerHtmlHead_TestingOuterHtmlGeneration() throws IOException, Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document document = new Document();
        Element element = new Element("");
        TextNode textNode = new TextNode("");
        element.appendChild(textNode);
        TextNode textNode2 = new TextNode("Hello World");
        textNode.appendChild(textNode2);

        Appendable accum = out;
        int depth = 0;
        Document.OutputSettings settings = null;
        textNode.outerHtmlHead(accum, depth, settings);

        assertEquals("<div><p>Hello World</p></div>", out.toString());
    }

    @Test
    public void outerHtmlTail_TestingOuterHtmlGeneration() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document document = new Document();
        Element element = new Element("");
        TextNode textNode = new TextNode("");
        Appendable accum = out;
        int depth = 0;
        Document.OutputSettings settings = null;

        textNode.outerHtmlTail(accum, depth, settings);
    }

    @Test
    public void toString_TestingToStringMethod() throws Exception {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.toString());
    }

    @Test
    public void clone_CreateClone_ReturnsTextNode() {
        TextNode textNode = new TextNode("");
        TextNode clonedTextNode = textNode.clone();
        assertNotNull(clonedTextNode);
        assertTrue(textNode.equals(clonedTextNode));
    }

    @Test
    public void createFromEncoded_CreateTextNodeFromString_ReturnsTextNode() throws Exception {
        String encodedText = "&lt;Hello World&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello World", textNode.getWholeText());
    }

}