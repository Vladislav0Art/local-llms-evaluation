package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    private TextNode node;
    private Document document;

    @Before
    public void setup() {
        document = new Document();
        when(document.append()).thenReturn(document);
        node = new TextNode("Hello World");
    }

    @Test
    public void testnodeName_() {
        // Arrange
        String expected = "TextNode";
        String actual = node.nodeName();

        // Act
        String result = actual;

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testText__() {
        // Arrange
        String expected = "Hello World";
        String actual = node.text();

        // Act
        String result = actual;

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testText____() {
        // Arrange
        String expected = "Hello World";
        String actual = node.text("Hello");

        // Act
        String result = actual;

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testGetWholeText__() {
        // Arrange
        String text = "Hello World";
        String expected = "Hello World";

        // Act
        String result = node.getWholeText();

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testIsBlank__() {
        // Arrange
        boolean expected = false;
        String actual = node.isBlank();

        // Act
        Boolean result = actual;

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testSplitText_0() {
        // Arrange
        int offset = 0;
        String text = "Hello World";
        String expected = "Hello";

        // Act
        TextNode result = node.splitText(offset);

        // Assert
        assertEquals(expected, result.getText());
        verify(document).append().atOffset(0);
    }

    @Test
    public void testSplitText_1() {
        // Arrange
        int offset = 3;
        String text = "Hello World";
        String expected = "World";

        // Act
        TextNode result = node.splitText(offset);

        // Assert
        assertEquals(expected, result.getText());
        verify(document).append().atOffset(3);
    }

    @Test
    public void testOuterHtmlHead() {
        // Arrange
        String expected = "<head></head>";
        when(node.outerHtmlHead(any(Appendable.class), any(int.class), any(Document.OutputSettings.class))).thenReturn(expected);

        // Act
        String result = node.outerHtmlHead(document, 0, Document.OutputSettings.PRESERVEWhiteSpace);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testOuterHtmlTail() {
        // Arrange
        String expected = "<head></head><body></body>";
        when(node.outerHtmlTail(any(Appendable.class), any(int.class), any(Document.OutputSettings.class))).thenReturn(expected);

        // Act
        String result = node.outerHtmlTail(document, 0, Document.OutputSettings.PRESERVEWhiteSpace);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testToString__() {
        // Arrange
        String expected = "<TextNode>Hello World</TextNode>";

        // Act
        String result = node.toString();

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testClone__() {
        // Arrange
        TextNode result = new TextNode("Hello World");
        when(node.clone()).thenReturn(result);

        // Act
        TextNode actual = (TextNode) node.clone();

        // Assert
        assertEquals(actual, result);
    }

}