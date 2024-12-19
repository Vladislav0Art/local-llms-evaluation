package org.jsoup.nodes;

public class GeneratedOfTextCreatesTextNode {

    private TextNode textNode;

    @Test
    public void ofTextCreatesTextNode() {
        textNode = new TextNode("Hello World");
        assert textNode != null;
    }

}