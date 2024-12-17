package org.jsoup.nodes;

public class GeneratedTextTextNodeValueReturnsText {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void splitText(int offset) {
        if (offset >= text.length()) {
            throw new IllegalArgumentException("Offset is beyond the length of the text");
        }
        // implement splitting logic here
    }

    public boolean isBlank() {
        return text.isEmpty();
    }
}

public class TextNodeTest {

    @Test
    public void textTextNodeValueReturnsText() {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getText());
    }

}