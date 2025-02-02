package org.jsoup.nodes;

public class GeneratedTextSetterChangesValue {

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
    public void textSetterChangesValue() {
        TextNode node = new TextNode();
        node.setText("New Value");
        assertEquals("New Value", node.getText());
    }

}