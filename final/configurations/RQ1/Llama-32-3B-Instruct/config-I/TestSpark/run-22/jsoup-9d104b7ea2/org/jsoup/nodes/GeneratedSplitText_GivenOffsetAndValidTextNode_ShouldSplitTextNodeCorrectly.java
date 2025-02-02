package org.jsoup.nodes;

public class GeneratedSplitText_GivenOffsetAndValidTextNode_ShouldSplitTextNodeCorrectly {

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
    public void splitText_GivenOffsetAndValidTextNode_ShouldSplitTextNodeCorrectly() {
        TextNode textNode = new TextNode();
        textNode.setText("Hello World");
        Node resultTextNode1 = new Node();
        resultTextNode1.setValue("");
        textNode.splitText(7, resultTextNode1);
        assertEquals(resultTextNode1.getValue(), "Hello ");

        Node resultTextNode2 = new Node();
        resultTextNode2.setValue("");
        textNode.splitText(0, resultTextNode2);
        assertEquals(resultTextNode2.getValue(), "World");
    }

}