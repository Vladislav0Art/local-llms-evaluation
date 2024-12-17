package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestSplitText {

    private String nodeName;
    private String text;

    public TestNode(String text) {
        this.text = text;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getNodeName() {
        return nodeName;
    }

    public String getText() {
        return text;
    }
}

public class TextNode extends TestNode {
    public TextNode(String text) {
        super(text);
    }

    @Override
    public boolean isBlank() {
        return this.getText().isEmpty();
    }

    public void setText(String text) {
        this.text = text;
    }
}

import org.junit.Test;

public class TextNodeTest {

    @Test
    public void testSplitText() {
        TextNode textNode = new TextNode("Hello World");
        textNode.setNodeName("#text");

        try {
            // This will not compile, we need to add a method that throws ValidationException
        } catch (ValidationException e) {
        }
    }

}