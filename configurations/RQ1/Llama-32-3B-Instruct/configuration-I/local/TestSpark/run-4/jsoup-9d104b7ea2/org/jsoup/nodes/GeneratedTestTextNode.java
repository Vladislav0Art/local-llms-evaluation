package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestTextNode {

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
    public void testTextNode() {
        TestNode testNode = new TestNode("Hello");
        testNode.setNodeName("#text");

        System.out.println(testNode.getNodeName());  // Print the nodeName
        System.out.println(testNode.getText());       // Print the text

        assertTrue(testNode.isBlank());

        testNode.setText("NewText");
        assertFalse(testNode.isBlank());
    }

}