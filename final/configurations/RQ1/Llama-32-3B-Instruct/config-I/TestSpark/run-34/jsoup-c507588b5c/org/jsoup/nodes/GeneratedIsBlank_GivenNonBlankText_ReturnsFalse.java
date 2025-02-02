package org.jsoup.nodes;

public class GeneratedIsBlank_GivenNonBlankText_ReturnsFalse {

    private String text;

    public TextNode(String text) {
        this.text = text;
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
        return new TextNode(tail);
    }
}

package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void isBlank_GivenNonBlankText_ReturnsFalse() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

}