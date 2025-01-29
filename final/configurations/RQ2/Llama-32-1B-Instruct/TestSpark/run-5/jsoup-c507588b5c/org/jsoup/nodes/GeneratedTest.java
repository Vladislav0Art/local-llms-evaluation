package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    public String nodeName() {
        return "text";
    }

    public void setText(String text) {
        this.text = text;
    }

    @Test
    public void nodeName_test() {
        TextNode node = new TextNode("Hello World");
        assertEquals("text", node.nodeName());
    }

    @Test
    public void text_test() {
        String originalText = "Hello World";
        TextNode node = new TextNode(originalText);
        assertEquals(originalText, node.text());
        assertEquals(originalText, node.text(originalText));
    }

    @Test
    public void getWholeText_test() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.getWholeText());
    }

    @Test
    public void isBlank_test() {
        TextNode node = new TextNode("Hello World");
        assertTrue(node.isBlank());
    }

    @Test
    public void splitText_test() {
        TextNode node = new TextNode("Hello World");
        assertEquals(1, node.splitText(0));
        assertEquals("Hello", node.splitText(1).text());
    }

    @Test
    public void toString_test() {
        TextNode node = new TextNode("Hello World");
        String output = node.toString();
        assertEquals("<text> Hello <span>World</span></text>", output);
    }

    @Test
    public void clone_test() {
        TextNode node = new TextNode("Hello World");
        TextNode clonedNode = (TextNode) node.clone();
        assertEquals(node, clonedNode);
    }

    @Test
    public void createFromEncoded_test() throws Exception {
        String encodedText = "Hello%20World";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals("Hello World", node.text());
    }

    @Test
    public void lastCharIsWhitespace_text() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            builder.append("   ");
        }
        String originalText = "Hello World";
        TextNode node = new TextNode(originalText);
        assertEquals(true, node.lastCharIsWhitespace(builder));
    }

}