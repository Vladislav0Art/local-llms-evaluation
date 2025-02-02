package org.jsoup.nodes;

public class GeneratedCreateTextNode_EmptyString_ReturnsEmptyTextNode {

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
    public void createTextNode_EmptyString_ReturnsEmptyTextNode() {
        TextNode textNode = new TextNode();
        assertTrue(textNode.getWholeText().isEmpty());
    }

}