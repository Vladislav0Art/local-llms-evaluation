package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public void setText(String newText) {
        this.text = newText;
    }

    public String getText() {
        return text;
    }

    public String splitText(int offset) {
        if (offset >= text.length()) {
            return "";
        }
        int tailLength = text.length() - offset;
        String head = text.substring(0, offset);
        return head + "\n" + text.substring(offset, offset + tailLength);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextNode that = (TextNode) o;
        return Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
}

public class GeneratedTest {

    public static TextNode getTextNode() {
        return new TextNode("Hello World");
    }

    @Test
    public void createTextNode_GivenRawText_ReturnsTextNode() {
        assertEquals(getTextNode(), TextNode.createFromEncoded("Hello World"));
    }

    @Test
    public void nodeName_ReturnsCorrectString() {
        assertEquals("#text", getTextNode().nodeName());
    }

    @Test
    public void text_GivenNonBlankText_ReturnsCorrectString() {
        String text = "Hello World";
        assertEquals(" Hello World ", getTextNode().text());
    }

    @Test
    public void textSet_GivenBlankText_SetCorrectly() {
        TextNode textNode = getTextNode();
        textNode.text("");
        assertTrue(textNode.text().isEmpty());
    }

    @Test
    public void textSet_GivenNonBlankText_SetCorrectly() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        textNode.text("New Text");
        assertEquals("New Text", textNode.text());
    }

    @Test
    public void splitText_GivenOffset_LessThanTextLength_ReturnsCorrectTextNode() {
        int offset = 5;
        String text = "Hello World";
        String tail = getTextNode().splitText(offset).text();
        assertEquals(text.substring(0, offset) + "\n" + tail, tail);
    }

    @Test
    public void clone_ReturnsCorrectTextNode() {
        TextNode textNode = getTextNode();
        TextNode clonedTextNode = textNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(textNode, clonedTextNode);
    }

}