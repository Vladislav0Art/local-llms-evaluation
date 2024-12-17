package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTest {

    @Test
    public void constructorTextTest() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

    @Test
    public void nodeNameTest() {
        String text = "div";
        TextNode node = new TextNode(text);
        assertEquals("div", node.nodeName());
    }

    @Test
    public void textMethodReturnsOriginalTextTest() {
        String originalText = "Hello, World!";
        TextNode node = new TextNode(originalText);
        assertEquals(originalText, node.text());
    }

    @Test
    public void textMethodPreservesWhitespaceTest() {
        String originalText = "Hello,\nWorld!";
        TextNode node = new TextNode(originalText);
        assertEquals("Hello,\nWorld!", node.text());
    }

    @Test
    public void splitTextReturnsNewTextNodeWithRemainingTextTest() {
        String originalText = "Hello, World!";
        int offset = 7;
        TextNode node = new TextNode(originalText);
        TextNode newTreeNode = node.splitText(offset);
        assertEquals("World!", newTreeNode.text());
        assertEquals(originalText.substring(0, offset), node.text());
    }

    @Test
    public void isBlankTextNodeIsEmptyOrOnlyWhitespaceTest() {
        String originalText = "   ";
        TextNode node = new TextNode(originalText);
        assertTrue(node.isBlank());

        String blankTextNode = "";
        TextNode blankNode = new TextNode(blankTextNode);
        assertTrue(blankNode.isBlank());
    }

    @Test
    public void cloneMethodReturnsNewTextNodeWithOriginalContentTest() {
        String originalText = "Hello, World!";
        TextNode node = new TextNode(originalText);
        TextNode clonedNode = node.clone();
        assertEquals(originalText, clonedNode.text());
    }

}