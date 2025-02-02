package org.jsoup.nodes;

public class GeneratedNodeName_GivenValidTextNode_ShouldReturnNodeId {

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
    public void nodeName_GivenValidTextNode_ShouldReturnNodeId() {
        TextNode textNode = new TextNode();
        textNode.setText("Hello World");
        String nodeId = "text";
        assertEquals(nodeId, textNode.getValue());
    }

}