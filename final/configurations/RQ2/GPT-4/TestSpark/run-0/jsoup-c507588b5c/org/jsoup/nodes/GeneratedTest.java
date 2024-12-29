package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        TextNode node = new TextNode("test");
        assertEquals("#text", node.nodeName());
    }

    @Test
    public void textContentTest() {
        String textContent = "test";
        TextNode node = new TextNode(textContent);
        assertEquals(textContent, node.text());
    }

    @Test
    public void textUpdateTest() {
        String textContent = "test";
        TextNode node = new TextNode("");
        node.text(textContent);
        assertEquals(textContent, node.text());
    }

    @Test
    public void getWholeTextTest() {
        String textContent = "test";
        TextNode node = new TextNode(textContent);
        assertEquals(textContent, node.getWholeText());
    }

    @Test
    public void isBlankTest() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void isNotBlankTest() {
        TextNode node = new TextNode("test");
        assertFalse(node.isBlank());
    }

    @Test
    public void splitTextTest() {
        String textContent = "test";
        TextNode node = new TextNode(textContent);
        TextNode newNode = node.splitText(2);
        assertEquals("te", node.text());
        assertEquals("st", newNode.text());
    }

    @Test
    public void toStringTest() {
        String textContent = "test";
        TextNode node = new TextNode(textContent);
        assertTrue(node.toString().contains(textContent));
    }

    @Test
    public void cloneTest() {
        TextNode node = new TextNode("test");
        TextNode clonedNode = node.clone();
        assertNotSame(node, clonedNode);
        assertEquals(node.text(), clonedNode.text());
    }

    @Test
    public void outerHtmlTailTest() {
        TextNode node = new TextNode("");
        StringBuilder stringBuilder = new StringBuilder();
        node.outerHtmlTail(stringBuilder, 0, new Document("").outputSettings());
        assertEquals("", stringBuilder.toString());
    }

    @Test
    public void createFromEncodedTest() {
        TextNode node = TextNode.createFromEncoded("test");
        assertEquals("test", node.text());
    }

    @Test
    public void outerHtmlHeadTest() {
        try {
            TextNode node = new TextNode("test");
            StringBuilder stringBuilder = new StringBuilder();
            node.outerHtmlHead(stringBuilder, 0, new Document("").outputSettings());
            assertEquals("test", stringBuilder.toString());
        } catch (IOException e) {
            fail("Test failed due to IOException: " + e.getMessage());
        }
    }

}