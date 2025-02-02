package org.jsoup.nodes;

public class GeneratedIsBlank_GivenOnlyWhitespaceAndValidTextNode_ShouldReturnTrue {

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
    public void isBlank_GivenOnlyWhitespaceAndValidTextNode_ShouldReturnTrue() {
        TextNode textNode = new TextNode();
        textNode.setText("");
        assertTrue(textNode.isBlank());
    }

}