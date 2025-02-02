package org.jsoup.nodes;

public class GeneratedIsBlank_GivenValidTextNode_ShouldReturnFalse {

    private String value;

    public void setValue(String value) {
    }
}

public class TextNode extends Node {
    public TextNode() {
    }

    public void setText(String text) {
        this.value = text;
    }

    public String getValue() {
        return this.value;
    }
}

public class TestSpark {

    @Test
    public void isBlank_GivenValidTextNode_ShouldReturnFalse() {
        TextNode textNode = new TextNode();
        textNode.setText("Hello World");
        assertFalse(textNode.isBlank());
    }

}