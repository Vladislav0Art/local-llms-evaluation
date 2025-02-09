package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void newNodeTextTest() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertNotNull(node.text());
        assertEquals(text, node.text());
    }

    @Test
    public void newNodeTextLengthTest() {
        String text = "Hello\nWorld";
        TextNode node = new TextNode(text);
        assertEquals(12, node.text().length());
    }

    @Test
    public void cloneTextNodeTest() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        TextNode clone = node.clone();
        assertNotNull(clone.text());
        assertEquals(text, clone.text());
    }

    @Test
    public void createFromEncodedTextNodeTest() throws IOException {
        String encodedText = "Hello World";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node.text());
        assertEquals(encodedText, node.text());
    }

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = "   Hello World";
        assertEquals("Hello World", TextNode.stripLeadingWhitespace(text));
    }

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder();
        assertTrue(TextNode.lastCharIsWhitespace(sb.append(' ').append('\n')));
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

    @Test
    public void normaliseWhitespaceTest() {
        String text = "\n  Hello\nWorld";
        assertEquals("Hello\nWorld", StringUtil.normaliseWhitespace(text));
    }

}