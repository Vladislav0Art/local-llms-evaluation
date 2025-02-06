package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void nodeName_TextNode_returnsnodeName() {
        // Arrange & Act
        TextNode node = new TextNode("");
        String result = node.nodeName();

        // Assert
        assertEquals("text", result);
    }

    @Test
    public void text_TextNode_returnsText() {
        // Arrange & Act
        TextNode node = new TextNode("Hello World");
        String result = node.text();

        // Assert
        assertEquals("Hello World", result);
    }

    @Test
    public void text_TextNode_setsText() {
        // Arrange
        TextNode node = new TextNode();
        String text = "New Hello World";

        // Act & Assert
        node.text(text);
        assertEquals(text, node.text());
    }

    @Test
    public void getWholeText_TextNode_returnsText() {
        // Arrange & Act
        TextNode node = new TextNode("Hello\nWorld");
        String result = node.getWholeText();

        // Assert
        assertEquals("Hello\nWorld", result);
    }

    @Test
    public void isBlank_TextNode_returnsTrueWhenBlank() {
        // Arrange
        TextNode node1 = new TextNode("");
        TextNode node2 = new TextNode("   ");

        // Act & Assert
        assertTrue(node1.isBlank());
        assertFalse(node2.isBlank());
    }

    @Test
    public void splitText_SplittingAtOffsetReturnsCorrectlySplitTextNode() throws IOException {
        // Arrange
        TextNode node = new TextNode("Hello\nWorld");
        int offset = 5;

        // Act & Assert
        TextNode result = node.splitText(offset);
        assertEquals(Arrays.asList("Hello", "World"), StringUtil.split(node.text(), '\n'));
    }

    @Test
    public void clone_CloneReturnsCorrectTextNode() {
        // Arrange & Act
        TextNode node = new TextNode("Clone Test");
        TextNode cloned = node.clone();

        // Assert
        assertEquals(node, cloned);
    }

    @Test
    public void createFromEncoded_CreateTextNodeFromEncodedString() throws IOException {
        // Arrange & Act
        String encodedText = "Hello";
        TextNode result = TextNode.createFromEncoded(encodedText);

        // Assert
        assertNotNull(result);
        assertEquals(encodedText, result.text());
    }

    @Test
    public void normaliseWhitespace_NormalisesWhitespaceCorrectly() {
        // Arrange
        String text = "   Hello World";

        // Act & Assert
        String expected = "Hello World";
        assertEquals(expected, TextNode.normaliseWhitespace(text));
    }

    @Test
    public void stripLeadingWhitespace_StripsLeadingWhitespaceCorrectly() {
        // Arrange
        String text = "   Hello World";

        // Act & Assert
        String expected = "Hello World";
        assertEquals(expected, TextNode.stripLeadingWhitespace(text));
    }

    @Test
    public void lastCharIsWhitespace_LastCharIsWhitespaceReturnsFalseForNonWhitespaceCharacters() {
        // Arrange
        StringBuilder sb = new StringBuilder("Hello");

        // Act & Assert
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}