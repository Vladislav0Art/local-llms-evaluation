package org.jsoup.nodes;

public class GeneratedEqualsMethodWorks {

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
    public void equalsMethodWorks() {
        TextNode textNode1 = new TextNode("Hello, World!");
        TextNode textNode2 = new TextNode("Hello, World!");
        assertTrue(textNode1.equals(textNode2));
    }

}