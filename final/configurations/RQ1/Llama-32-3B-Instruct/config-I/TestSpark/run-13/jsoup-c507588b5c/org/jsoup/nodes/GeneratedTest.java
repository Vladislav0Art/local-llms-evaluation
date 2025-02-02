package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        // Arrange
        String text = "Hello, World!";
        Document document = new Document();
        Element parent = Mockito.mock(Element.class);

        // Act
        TextNode textNode = TextNode.createFromEncoded(text);
        // Assert
        assertNotNull(textNode);
    }

    @Test
    public void createTextNode_GivenBlankText_ReturnsBlankTextNode() {
        // Arrange
        String blankText = "";
        Document document = new Document();
        Element parent = Mockito.mock(Element.class);

        // Act
        TextNode textNode = TextNode.createFromEncoded(blankText);
        // Assert
        assertTrue(textNode.isBlank());
    }

    @Test
    public void nodeName_GivenTextNode_ReturnsCorrectName() {
        // Arrange
        String text = "Hello, World!";
        Document document = new Document();
        Element parent = Mockito.mock(Element.class);
        TextNode textNode = new TextNode(text);

        // Act
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void getWholeText_GivenTextNode_ReturnsCorrectText() {
        // Arrange
        String text = "Hello, World!";
        Document document = new Document();
        Element parent = Mockito.mock(Element.class);
        TextNode textNode = new TextNode(text);

        // Act
        assertEquals(text, textNode.getWholeText());
    }

    @Test
    public void isBlank_GivenTextNode_ReturnsCorrectValue() {
        // Arrange
        String text = "   ";
        Document document = new Document();
        Element parent = Mockito.mock(Element.class);
        TextNode textNode = new TextNode(text);

        // Act
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitText_GivenTextNode_ReturnsCorrectTextNode() {
        // Arrange
        String text = "Hello, World!";
        Document document = new Document();
        Element parent = Mockito.mock(Element.class);
        TextNode textNode = new TextNode(text);

        // Act
        TextNode tailNode = textNode.splitText(6);
        assertEquals("World!", tailNode.text());
    }

    @Test
    public void splitText_GivenTextNodeOffsetGreaterThanLength_ReturnsTextNode() {
        // Arrange
        String text = "Hello, World!";
        Document document = new Document();
        Element parent = Mockito.mock(Element.class);
        TextNode textNode = new TextNode(text);

        // Act
        TextNode tailNode = textNode.splitText(7);
        assertNotNull(tailNode);
    }

    @Test
    public void splitText_GivenTextNodeOffsetNegative_ThrowsException() {
        // Arrange
        String text = "Hello, World!";
        Document document = new Document();
        Element parent = Mockito.mock(Element.class);
        TextNode textNode = new TextNode(text);

        // Act
        textNode.splitText(-1);
    }

    @Test
    public void splitText_GivenTextNodeOffsetGreaterThanOrEqualLength_ThrowsException() {
        // Arrange
        String text = "Hello, World!";
        Document document = new Document();
        Element parent = Mockito.mock(Element.class);
        TextNode textNode = new TextNode(text);

        // Act
        textNode.splitText(7);
    }

    @Test
    public void outerHtml_GivenTextNode_ReturnsCorrectString() {
        // Arrange
        String text = "Hello, World!";
        Document document = new Document();
        Element parent = Mockito.mock(Element.class);
        TextNode textNode = new TextNode(text);

        // Act
        StringBuilder result = new StringBuilder();
        textNode.outerHtmlHead(result, 0, document.outputSettings());
        assertEquals("<p>Hello, World!</p>", result.toString());
    }

}