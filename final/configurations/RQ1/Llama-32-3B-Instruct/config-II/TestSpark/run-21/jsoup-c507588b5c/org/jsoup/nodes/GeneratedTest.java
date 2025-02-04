package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void createTextNode_GivenRawText_ReturnsTextNodeWithCorrectValue() {
        // Given
        String text = "Hello World";

        // When
        TextNode textNode = new TextNode(text);

        // Then
        assertEquals(text, textNode.value());
    }

    @Test
    public void getWholeText_GivenTextNode_ReturnsTextNodeValue() {
        // Given
        TextNode textNode = new TextNode("Hello World");

        // When
        String wholeText = textNode.getWholeText();

        // Then
        assertEquals("Hello World", wholeText);
    }

    @Test
    public void getWholeText_GivenBlankTextNode_ReturnsBlankString() {
        // Given
        TextNode textNode = new TextNode("");

        // When
        String wholeText = textNode.getWholeText();

        // Then
        assertTrue(wholeText.isEmpty());
    }

    @Test
    public void isBlank_GivenTextNode_WithNoValue_ReturnsTrue() {
        // Given
        TextNode textNode = new TextNode("");

        // When
        boolean isEmpty = textNode.isBlank();

        // Then
        assertTrue(isEmpty);
    }

    @Test
    public void splitText_GivenTextNode_ReturnsNewTextNode() {
        // Given
        TextNode textNode = new TextNode("Hello World");
        int offset = 6;
        Mockito.when(textNode.coreValue()).thenReturn("Hello World");

        // When
        TextNode tailNode = textNode.splitText(offset);

        // Then
        assertEquals(10, tailNode.value().length());
    }

    @Test
    public void splitText_GivenTextNode_WithEmptyValue_ReturnsTextNode() {
        // Given
        TextNode textNode = new TextNode("");
        int offset = 0;
        Mockito.when(textNode.coreValue()).thenReturn("");

        // When
        TextNode tailNode = textNode.splitText(offset);

        // Then
        assertTrue(tailNode.value().isEmpty());
    }

    @Test
    public void setTextNodeText_GivenNewTextNode_ReturnsUpdatedTextNode() {
        // Given
        TextNode textNode = new TextNode("");
        String newText = "Hello World";
        Mockito.when(textNode.coreValue()).thenReturn("");

        // When
        textNode.text(newText);

        // Then
        assertEquals("Hello World", textNode.value());
    }

    @Test
    public void toString_GivenTextNode_ReturnsOuterHtml() {
        // Given
        TextNode textNode = new TextNode("Hello World");

        // When
        String outerHtml = textNode.toString();

        // Then
        assertTrue(outerHtml.contains("<span>Hello World</span>"));
    }

    @Test
    public void clone_GivenTextNode_ReturnsNewTextNode() {
        // Given
        TextNode originalTextNode = new TextNode("Hello World");

        // When
        TextNode clonedTextNode = originalTextNode.clone();

        // Then
        assertNotNull(clonedTextNode);
        assertEquals(originalTextNode.value(), clonedTextNode.value());
    }

    @Test
    public void createTextNodeFromEncoded_GivenEncodedText_ReturnsTextNode() {
        // Given
        String encodedText = "&lt;Hello World&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        // When
        String unescapedValue = textNode.value();

        // Then
        assertEquals("Hello World", unescapedValue);
    }

    @Test
    public void getTextNodeName_GivenTextNode_ReturnsCorrectName() {
        // Given
        TextNode textNode = new TextNode("");

        // When
        String nodeName = textNode.nodeName();

        // Then
        assertEquals("#text", nodeName);
    }

}