package org.jsoup.nodes;

import static org.junit.Assert.*;

public class GeneratedTest {

    private String text;

    public static TextNode createTextNode(String text) {
        return new TextNode(text);
    }

    public void text(String newText) {
        this.text = newText;
    }

    public String nodeName() {
        return "#text";
    }

    public String textContent() {
        return this.text;
    }

    public boolean isBlank() {
        return this.text.trim().isEmpty();
    }

    public TextNode splitText(int offset) throws IllegalArgumentException {
        if (offset < 0 || offset > this.text.length()) {
            throw new IllegalArgumentException("Offset out of range");
        }
        String tail = this.text.substring(offset);
        return createTextNode(tail);
    }
}

package org.jsoup.nodes;

import static org.junit.Assert .*;

public class GeneratedTest {

    @Test
    public void textNodeCreation_GivenText_ReturnsTextNode() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
    }

    @Test
    public void nodeName_GivesCorrectNodeName() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void text_GivenText_ReturnsUnencodedText() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello, World!", textNode.text());
    }

    @Test
    public void isBlank_GivenBlankText_ReturnsTrue() {
        String text = "   ";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_GivenNonBlankText_ReturnsFalse() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitText_SplitOffsetOutOfRange_ThrowsIllegalArgumentException() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        int offset = 100;
        assertThrows(IllegalArgumentException.class, () -> textNode.splitText(offset));
    }

    @Test
    public void splitText_SplitsCorrectlyAtOffset_GivenText() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        int offset = 6;
        TextNode tailNode = textNode.splitText(offset);
        assertEquals("World", tailNode.text());
    }

}