package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedTest {

    @Test
    public void nodeName_test() {
        // Arrange
        String text = "Hello World";
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // Act
        TextNode node = TextNode.createFromEncoded(text);

        // Assert
        assertEquals("Hello World", node nodeName());
    }

    @Test
    public void text_test() {
        // Arrange
        String text = "Hello World";
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // Act
        TextNode node = TextNode.createFromEncoded(text);
        assertEquals("Hello World", node text());

        // Assert
        verify(accum, never()).append("Hello World");
    }

    @Test
    public void text_set_text_test() {
        // Arrange
        String text = "Hello World";
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // Act
        TextNode node = TextNode.createFromEncoded(text);
        assertEquals("Hello World", node text());
        node = TextNode.textSetText("New Value");
        assertEquals("Hello World New Value", node text());

        // Assert
        verify(accum, never()).append("Hello World");
    }

    @Test
    public void getWholeText_test() {
        // Arrange
        String text = "Hello World";
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // Act
        TextNode node = TextNode.createFromEncoded(text);
        assertEquals("Hello World", node getWholeText());

        // Assert
        verify(accum, never()).append("Hello World");
    }

    @Test
    public void isBlank_test() {
        // Arrange
        String text = "Hello";
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // Act
        TextNode node = TextNode.createFromEncoded(text);
        assertEquals(false, node isBlank());

        // Assert
        verify(accum, never()).append("false");
    }

    @Test
    public void splitText_test() {
        // Arrange
        String text = "Hello World";
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // Act
        TextNode node = TextNode.createFromEncoded(text);
        assertEquals(3, node splitText(1));
    }

    @Test
    public void outerHtmlHead_test() {
        // Arrange
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // Act
        TextNode node = TextNode.createFromEncoded("Hello World");
        node outerHtmlHead (new Appendable[]{}, 1, Document.OutputSettings.DEFAULT);

        // Assert
        verify(accum, never()).append("<html><head>Hello World</head></html>");
    }

    @Test
    public void outerHtmlTail_test() {
        // Arrange
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // Act
        TextNode node = TextNode.createFromEncoded("Hello World");
        node outerHtmlTail (new Appendable[]{}, 1, Document.OutputSettings.DEFAULT);

        // Assert
        verify(accum, never()).append("<html><head>Hello World</head></html>");
    }

    @Test
    public void toString_test() {
        // Arrange
        String text = "Hello World";
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // Act
        TextNode node = TextNode.createFromEncoded(text);
        assertEquals("Hello World", node toString());

        // Assert
        verify(accum, never()).append("Hello World");
    }

    @Test
    public void clone_test() {
        // Arrange
        String text = "Hello World";
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // Act
        TextNode node = TextNode.createFromEncoded(text);
        TextNode clonedNode = node.clone();

        // Assert
        verify(accum, never()).append("Hello World");
    }

    @Test
    public void createFromEncoded_test() {
        // Arrange
        String encodedText = "Hello World";
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // Act
        TextNode node = TextNode.createFromEncoded(encodedText);

        // Assert
        verify(accum, never()).append("Hello World");
    }

    @Test
    public void normaliseWhitespace_test() {
        // Arrange
        String text = "   Hello   ";
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // Act
        TextNode node = TextNode.createFromEncoded(text);
        assertEquals("Hello", node normaliseWhitespace());

        // Assert
        verify(accum, never()).append("false");
    }

    @Test
    public void stripLeadingWhitespace_test() {
        // Arrange
        String text = "   Hello   ";
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // Act
        TextNode node = TextNode.createFromEncoded(text);
        assertEquals("Hello", node stripLeadingWhitespace());

        // Assert
        verify(accum, never()).append("false");
    }

    @Test
    public void lastCharIsWhitespace_test() {
        // Arrange
        String text = "   Hello   ";
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = null;

        // Act
        TextNode node = TextNode.createFromEncoded(text);
        assertEquals("Hello", node lastCharIsWhitespace(new StringBuilder()));

        // Assert
        verify(accum, never()).append("false");
    }

}