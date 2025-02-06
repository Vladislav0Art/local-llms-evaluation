package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedTest {

    @Mock
    private Document.OutputSettings outputSettings;

    public void setup() {
        Mockito.when(outputSettings.getIndent()).thenReturn(0);
        Mockito.when(outputSettings.getLineBreaks()).thenReturn(false);
    }

    @Test
    public void newNodeStringIsEmpty_ReturnsTrue() {
        setup();
        TextNode textNode = new TextNode("");
        assertTrue(textNode.text().isEmpty());
    }

    @Test
    public void newNodeStringIsNotEmpty_ReturnsTrue() {
        setup();
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.text().isEmpty());
    }

    @Test
    public void cloneNode_NewNodeHasSameText() {
        setup();
        TextNode originalNode = new TextNode("Hello World");
        TextNode clonedNode = originalNode.clone();
        assertEquals(originalNode.text(), clonedNode.text());
    }

    @Test
    public void createFromEncoded_EmptyString_ReturnsNull() {
        setup();
        String encodedText = "";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNull(textNode);
    }

    @Test
    public void normaliseWhitespace_SimpleWhitespace_ReturnsSameText() {
        setup();
        String originalText = "   ";
        String expectedText = "   ";
        assertEquals(expectedText, TextNode.normaliseWhitespace(originalText));
    }

    @Test
    public void stripLeadingWhitespace_SimpleWhitespace_ReturnsSameTextWithoutWhitespace() {
        setup();
        String originalText = "   Hello World";
        String expectedText = "Hello World";
        assertEquals(expectedText, TextNode.stripLeadingWhitespace(originalText));
    }

    @Test
    public void splitText_ValidOffset_SplitsCorrectly() {
        setup();
        String text = "Hello World";
        int offset = 5;
        TextNode splitTextNode = new TextNode(text).splitText(offset);
        assertEquals("World", splitTextNode.text());
    }

    @Test
    public void isBlank_TextIsBlank_ReturnsTrue() {
        setup();
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_TextNotNotBlank_ReturnsFalse() {
        setup();
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

}