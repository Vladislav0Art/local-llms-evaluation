package org.jsoup.nodes;

public class GeneratedCloneCreatesCorrectCopy {

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
    public void cloneCreatesCorrectCopy() {
        TextNode original = new TextNode();
        original.setText("Hello World");
        TextNode clone = new TextNode(original.getText());
        assertEquals(original.getText(), clone.getText());
    }

}