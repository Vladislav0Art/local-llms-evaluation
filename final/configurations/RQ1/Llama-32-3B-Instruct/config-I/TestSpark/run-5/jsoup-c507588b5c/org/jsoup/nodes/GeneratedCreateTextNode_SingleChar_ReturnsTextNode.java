package org.jsoup.nodes;

public class GeneratedCreateTextNode_SingleChar_ReturnsTextNode {

    private String text;

    public TextNode() {
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getWholeText() {
        return text;
    }
}

public class GeneratedTest {

    @Test
    public void createTextNode_SingleChar_ReturnsTextNode() {
        TextNode textNode = new TextNode();
        textNode.setText("a");
        assertNotNull(textNode);
    }

}