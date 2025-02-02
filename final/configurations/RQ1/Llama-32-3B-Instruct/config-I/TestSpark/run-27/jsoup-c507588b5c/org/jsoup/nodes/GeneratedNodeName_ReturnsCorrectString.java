package org.jsoup.nodes;

public class GeneratedNodeName_ReturnsCorrectString {

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
    public void nodeName_ReturnsCorrectString() {
        assertEquals("#text", getTextNode().getClass().getSimpleName());
    }

}