package org.jsoup.nodes;

public class GeneratedCreateTextNode_GivenValidText_ShouldReturnNewTextNode {

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
    public void createTextNode_GivenValidText_ShouldReturnNewTextNode() {
        TextNode textNode = new TextNode();
        textNode.setText("Hello World");
        assertEquals("Hello World", textNode.getValue());
    }

}