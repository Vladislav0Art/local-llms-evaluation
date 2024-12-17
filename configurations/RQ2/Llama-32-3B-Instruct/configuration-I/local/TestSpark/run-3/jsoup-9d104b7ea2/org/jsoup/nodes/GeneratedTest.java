package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void text_shouldReturnOriginalText() {
        String text = "Hello World!";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

    @Test
    public void getWholeText_shouldReplaceNewlinesWithSpaces() {
        String text = "Hello\nWorld!";
        TextNode node = new TextNode(text);
        assertEquals("Hello World!", node.getWholeText());
    }

    @Test
    public void isBlank_shouldReturnTrueForEmptyOrWhitespaceOnlyText() {
        String text = "";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());

        String whitespaceOnlyText = "   ";
        node = new TextNode(whitespaceOnlyText);
        assertTrue(node.isBlank());
    }

    @Test
    public void splitText_shouldReturnNewTextNodeForSplitText() {
        String text = "Hello World!";
        TextNode node = new TextNode(text);
        int offset = 6;
        TextNode newNode = node.splitText(offset);
        assertEquals("World", newNode.text());
    }

}