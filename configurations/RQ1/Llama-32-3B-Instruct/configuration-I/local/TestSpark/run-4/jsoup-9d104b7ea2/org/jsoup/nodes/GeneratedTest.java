package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTest {

    private String nodeName;
    private String text;

    public TestNode() {
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
    public TextNode() {
    }

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

public class ValidationException extends Exception {
}

public class NodeSplitter {

    public static String splitText(TestNode node, int index) throws ValidationException {
        if (index 0 || index > node.getText().length()){
            throw new ValidationException("Index out of bounds");
        }

        return node.getText().substring(0, index);
    }
}

import org.junit.Test;

public class TextNodeTest {

    @Test
    public void CreateTextNode_GivenRawText_ReturnsTextNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals("#text", textNode.nodeName());
        assertEquals(text, textNode.text());
    }

    @Test
    public void CreateTextNode_GivenEmptyString_ReturnsBlankTextNode() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void SetText_GivenRawText_SettingAndGettingTextWorksCorrectly() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals("#text", textNode.nodeName());
        assertEquals(text, textNode.text());

        textNode.text("New Text");
        assertEquals("New Text", textNode.text());
    }

    @Test
    public void SplitText_GivenRawText_SplittingWorksCorrectly() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        int offset = 7;
        TextNode tailNode = textNode.splitText(offset);
        assertEquals("Hello", textNode.text());
        assertEquals("World", tailNode.text());
    }

}