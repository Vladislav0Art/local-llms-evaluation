package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Appendable;

public class GeneratedTest {

    @Test
    public void newTextNode_GivenEmptyText_ReturnsEmptyTextNode() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.text());
    }

    @Test
    public void newTextNode_GivenNonEmptyText_ReturnsNonEmptyTextNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

    @Test
    public void nodeName_ForTextNode_ReturnsNodeName() {
        String nodeName = "text-node";
        TextNode textNode = new TextNode(nodeName);
        assertEquals(nodeName, textNode.nodeName());
    }

    @Test
    public void text_ForTextNode_ReturnsTextNodeText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

    @Test
    public void text_ForTextNode_GivenNewValue

    SetsNewTextNodeText() {
        String newText = "New Hello World";
        TextNode textNode = new TextNode(newText);
        textNode.setText(newText);
        assertEquals(newText, textNode.getText());
    }

    @Test
    public void getWholeText_ForTextNode_ReturnsTextNodeText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

    @Test
    public void isBlank_ForTextNode_GivenEmptyText_ReturnsTrue() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_ForTextNode_GivenNonEmptyText_ReturnsFalse() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitText_ForTextNode_GivenOffsetSplitReturnsNewTextNode() {
        TextNode originalText = new TextNode("Hello World");
        TextNode clonedText = originalText.splitText(6);
        assertEquals(originalText.text(), clonedText.text().substring(0, 5));
    }

    @Test
    public void clone_ForTextNode_ReturnsClonedTextNode() {
        TextNode originalText = new TextNode("Hello World");
        TextNode clonedText = originalText.clone();
        assertEquals(originalText.getText(), clonedText.getText());
    }

    @Test
    public void createFromEncoded_ForEncodedText_ReturnsTextNode() throws IOException {
        String encodedText = "Hello%20World";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals(encodedText, textNode.getText());
    }

    @Test
    public void normaliseWhitespace_ForTextnormalisesWhitespace() {
        String text = "   Hello World   ";
        String expectedText = "Hello World";
        assertEquals(expectedText, StringUtil.normaliseWhitespace(text));
    }

    @Test
    public void stripLeadingWhitespace_ForTextstripsLeadingWhitespace() {
        String text = "   Hello World   ";
        String expectedText = "Hello World";
        assertEquals(expectedText, StringUtil.stripLeadingWhitespace(text));
    }

    @Test
    public void lastCharIsWhitespace_ForEmptyStringBuilder_ReturnsFalse() {
        StringBuilder sb = new StringBuilder();
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void lastCharIsWhitespace_ForNonEmptyStringBuilder_ReturnsTrue() {
        StringBuilder sb = new StringBuilder("Hello World");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}