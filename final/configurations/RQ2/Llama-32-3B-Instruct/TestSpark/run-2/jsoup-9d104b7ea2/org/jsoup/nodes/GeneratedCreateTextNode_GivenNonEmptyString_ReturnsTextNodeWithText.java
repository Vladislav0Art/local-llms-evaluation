package org.jsoup.nodes;

public class GeneratedCreateTextNode_GivenNonEmptyString_ReturnsTextNodeWithText {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void splitText(int offset) {
        // implementation
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TextNode) {
            return this.getText().equals(((TextNode) obj).getText());
        }
        return false;
    }

    @Override
    public String toString() {
        return text;
    }

    public static TextNode createFromEncoded(String encodedText) throws IOException {
        // implementation
        return new TextNode(encodedText);
    }

    public TextNode clone() {
        return new TextNode(this.text);
    }
}

public class GeneratedTest {

    @Test
    public void createTextNode_GivenNonEmptyString_ReturnsTextNodeWithText() {
        TextNode textNode = new TextNode("Hello, World!");
        assertEquals("Hello, World!", textNode.getText());
    }

}