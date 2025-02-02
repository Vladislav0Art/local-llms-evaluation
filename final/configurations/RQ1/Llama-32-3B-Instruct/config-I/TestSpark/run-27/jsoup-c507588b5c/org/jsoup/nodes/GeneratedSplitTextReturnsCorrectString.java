package org.jsoup.nodes;

public class GeneratedSplitTextReturnsCorrectString {

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
    public void splitTextReturnsCorrectString() {
        TextNode node = new TextNode();
        node.setText("Hello World");
        assertEquals("", node.splitText(5));
    }

}