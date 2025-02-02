package org.jsoup.nodes;

public class GeneratedSplitText_SplitsCorrectlyAtOffset_GivenText {

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
    public void splitText_SplitsCorrectlyAtOffset_GivenText() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        int offset = 6;
        TextNode tailNode = textNode.splitText(offset);
        assertEquals("World", tailNode.textContent());
    }

}