package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest {

    public boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    @Test
    public void newNodeWithTextTest() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

    @Test
    public void newNodeWithoutTextTest() {
        TextNode node = new TextNode("");
        assertNull(node.text());
    }

    @Test
    public void nodeNameTest() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals("text", node.nodeName());
    }

    @Test
    public void cloneTest() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        TextNode cloned = node.clone();
        assertNotNull(cloned);
        assertEquals(text, cloned.text());
    }

    @Test
    public void isBlankTest() {
        String text = "   ";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());
    }

    @Test
    public void splitTextTest() throws IOException {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        int offset = 5;
        TextNode result = node.splitText(offset);
        assertNotNull(result);
        assertEquals(8, result.text().length());
    }

    @Test
    public void getWholeTextTest() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals("Hello World", node.getWholeText());
    }

    @Test
    public void normaliseWhitespaceTest() {
        String text = "\t  ";
        assertTrue(StringUtil.normaliseWhitespace(text).equals("   "));
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = "   Hello World";
        assertEquals("Hello World", TextNode.stripLeadingWhitespace(text));
    }

    @Test
    public void cloneTest() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        TextNode cloned = node.clone();
        assertNotNull(cloned);
        assertEquals(text, cloned.text());
    }

    public static boolean isNotEmpty(String str) {
        return str != null && !str.isEmpty();
    }

}