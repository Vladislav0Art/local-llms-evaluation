package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedTest {

    @Test
    public void textNodeCreation_SimpleText() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.text());
    }

    @Test
    public void textNodeCreation_EmptyText() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void nodeName_TextNodeName() {
        TextNode node = new TextNode("test");
        assertEquals("text", node.nodeName());
    }

    @Test
    public void text_UpdateText() {
        TextNode node = new TextNode("Hello World");
        String newText = "New Text";
        node.text(newText);
        assertEquals(newText, node.text());
    }

    @Test
    public void getWholeText_SimpleText() throws IOException {
        // Arrange
        Document document = new Document();
        TextNode node = new TextNode("Hello World");

        // Act
        String wholeText = node.getWholeText();

        // Assert
        assertEquals("Hello World", wholeText);
    }

    @Test
    public void getWholeText_WithChildNodes() throws IOException {
        // Arrange
        Document document = new Document();
        TextNode node = new TextNode("Hello World");
        LeafNode childNode = new LeafNode(" Child Node");

        // Act
        String wholeText = node.getWholeText();

        // Assert
        assertEquals("Hello WorldChild Node", wholeText);
    }

    @Test
    public void isBlank_TextIsBlank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void isBlank_NonBlankText() {
        TextNode node = new TextNode("Hello World");
        assertFalse(node.isBlank());
    }

    @Test
    public void splitText_SplitAtOffset() throws IOException {
        // Arrange
        Document document = new Document();
        TextNode node = new TextNode("Hello World");

        // Act
        String[] result = node.splitText(6);

        // Assert
        String[] expected = {"Hello", "World"};
        assertArrayEquals(expected, result);
    }

    @Test
    public void clone_TextClone() {
        TextNode original = new TextNode("Original");
        TextNode cloned = original.clone();

        assertNotNull(cloned);
        assertEquals(original.text(), cloned.text());
    }

    @Test
    public void createFromEncoded_EncodedTextCreation() {
        String encodedText = "Hello World";
        TextNode node = TextNode.createFromEncoded(encodedText);

        assertNotNull(node);
        assertEquals("Hello World", node.text());
    }

    @Test
    public void normaliseWhitespace_WithLeadingSpaces() {
        String text = "   Hello World";
        String expected = "Hello World";

        assertEquals(expected, StringUtil.normaliseWhitespace(text));
    }

    @Test
    public void stripLeadingWhitespace_WithSpaces() {
        String text = "   Hello World";
        String expected = "Hello World";

        assertEquals(expected, StringUtil.stripLeadingWhitespace(text));
    }

    @Test
    public void lastCharIsWhitespace_NoWhitespace() {
        StringBuilder sb = new StringBuilder("Hello World");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void lastCharIsWhitespace_WithWhitespaceAtEnd() {
        StringBuilder sb = new StringBuilder("Hello World ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}