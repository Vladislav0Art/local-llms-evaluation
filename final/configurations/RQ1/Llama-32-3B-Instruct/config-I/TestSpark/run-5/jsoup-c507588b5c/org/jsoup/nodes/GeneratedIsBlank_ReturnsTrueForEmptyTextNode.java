package org.jsoup.nodes;

public class GeneratedIsBlank_ReturnsTrueForEmptyTextNode {

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
    public void isBlank_ReturnsTrueForEmptyTextNode() {
        TextNode textNode = new TextNode();
        assertTrue(textNode.isBlank());
    }

}