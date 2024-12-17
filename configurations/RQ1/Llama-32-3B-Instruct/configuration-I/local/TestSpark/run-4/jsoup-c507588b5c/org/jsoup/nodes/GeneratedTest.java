package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void createTextNode_EmptyString() {
        String text = "";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());
    }

    @Test
    public void createTextNode_SingleCharacter() {
        String text = "a";
        TextNode node = new TextNode(text);
        assertFalse(node.isBlank());
        assertEquals(1, node.text().length());
    }

    @Test
    public void createTextNode_MultipleCharacters() {
        String text = "hello world";
        TextNode node = new TextNode(text);
        assertFalse(node.isBlank());
        assertEquals("hello world", node.getWholeText());
    }

    @Test
    public void nodeName_TextNode() {
        String text = "text";
        TextNode node = new TextNode(text);
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void text_NoWhitespace() {
        String text = "hello";
        TextNode node = new TextNode(text);
        assertEquals("hello", node.text());
    }

    @Test
    public void text_WithWhitespace() {
        String text = "hello   world";
        TextNode node = new TextNode(text);
        assertEquals("hello   world", node.text());
    }

    @Test
    public void text_NoContent() {
        String text = "";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());
    }

    @Test
    public void text_WhitespaceOnly() {
        String text = "\n";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());
    }

    @Test
    public void text_DuplicateSpaces() {
        String text = "   ";
        TextNode node = new TextNode(text);
        assertEquals("   ", node.text());
    }

    @Test
    public void splitText_NoOffset() {
        String text = "hello";
        TextNode node = new TextNode(text);
        int offset = 5;
        assertSame(node, node.splitText(offset));
    }

    @Test
    public void splitText_AtBeginning() {
        String text = "hello";
        TextNode node = new TextNode(text);
        int offset = 0;
        TextNode tailNode = node.splitText(offset);
        assertEquals("hello", node.text());
        assertTrue(tailNode.isBlank());
    }

    @Test
    public void splitText_AtEnd() {
        String text = "hello";
        TextNode node = new TextNode(text);
        int offset = 5;
        TextNode tailNode = node.splitText(offset);
        assertEquals("hello", tailNode.getWholeText());
        assertTrue(node.isBlank());
    }

    @Test
    public void splitText_CentralOffset() {
        String text = "hello";
        TextNode node = new TextNode(text);
        int offset = 2;
        TextNode tailNode = node.splitText(offset);
        assertEquals("llo", node.text());
        assertEquals("ell", tailNode.getWholeText());
    }

    @Test
    public void cloneTextNode_SameContent() {
        String text = "hello";
        TextNode node = new TextNode(text);
        assertSame(node, node.clone());
    }

    @Test
    public void cloneTextNode_DifferentContent() {
        String text1 = "hello";
        String text2 = "world";
        TextNode node1 = new TextNode(text1);
        TextNode node2 = new TextNode(text2);
        assertNotSame(node1, node2);
        assertEquals("hello", node1.getWholeText());
        assertEquals("world", node2.getWholeText());
    }

}