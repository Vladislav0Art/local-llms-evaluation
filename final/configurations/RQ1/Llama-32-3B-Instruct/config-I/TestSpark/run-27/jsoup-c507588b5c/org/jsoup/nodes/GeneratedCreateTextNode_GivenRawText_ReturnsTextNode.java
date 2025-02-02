package org.jsoup.nodes;

public class GeneratedCreateTextNode_GivenRawText_ReturnsTextNode {

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
    public void createTextNode_GivenRawText_ReturnsTextNode() {
        assertEquals(getTextNode(), TextNode.createFromString("Hello World"));
    }

}