package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void createTextNode_NormalText_ReturnsCorrectTextNode() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("#text", textNode.nodeName());
        assertEquals("Hello World", textNode.text());
    }

    @Test
    public void createTextNode_EmptyString_ReturnsBlankTextNode() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void text_SettingText_ReturnsCorrectTextNode() {
        TextNode textNode = new TextNode("Hello World");
        String newText = "New Text";
        textNode.text(newText);
        assertEquals(newText, textNode.text());
    }

    @Test
    public void getWholeText_GettingTextWithWhitespace_ReturnsCorrectText() {
        TextNode textNode = new TextNode(" Hello World  ");
        String expectedText = "Hello World ";
        assertEquals(expectedText, textNode.getWholeText());
    }

    @Test
    public void isBlank_TestingForBlankTextNode_ReturnsTrue() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());

        textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());

        textNode = new TextNode("Hello World");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitText_SplittingTextNodeAtOffset_ReturnsCorrectNodes() throws IOException {
        TextNode originalTextNode = new TextNode("Hello World");
        TextNode splitTextNode = originalTextNode.splitText(6);
        assertEquals(originalTextNode.text(), originalTextNode.getWholeText());

        String expectedWholeTextAfterSplit = "World";
        assertTrue(splitTextNode.text().equals(expectedWholeTextAfterSplit));
    }

    @Test
    public void outerHtmlHead_GeneratingOuterHTMLForTextNode_ReturnsCorrectString() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document document = new Document();
        TextNode textNode = new TextNode("   ");
        Element parentNode = new Element();
        textNode.setParentNode(parentNode);
        textNode.addChildren(0, null);

        try {
            textNode.outerHtmlHead(outContent, 1, new Document.OutputSettings());
        } catch (IOException e) {
            fail(e.getMessage());
        }

        String expectedOutput = "<span>   </span>";
        assertEquals(expectedOutput, outContent.toString());
    }

}