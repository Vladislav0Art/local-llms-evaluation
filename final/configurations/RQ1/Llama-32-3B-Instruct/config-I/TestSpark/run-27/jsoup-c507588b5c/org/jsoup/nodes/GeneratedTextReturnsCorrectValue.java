package org.jsoup.nodes;

public class GeneratedTextReturnsCorrectValue {

    private String text;

    public static TextNode createFromString(String text) {
        return new TextNode(text);
    }

    public void setText(String newText) {
        this.text = newText;
    }

    public String getText() {
        return text;
    }
}

public class GeneratedTest {

    public static TextNode getTextNode() {
        return TextNode.createFromString("Hello World");
    }

    @Test
    public void textReturnsCorrectValue() {
        TextNode node = new TextNode();
        node.setText("Hello World");
        assertEquals("Hello World", node.getText());
    }

}