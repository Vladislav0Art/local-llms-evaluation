package org.jsoup.nodes;

public class GeneratedTestTextNodeSetNodeName {

    private String nodeName;
    private String text;

    public TextNode() {
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getNodeName() {
        return nodeName;
    }
}

public class GeneratedTest {

    @Test
    public void testTextNodeSetNodeName() {
        TextNode textNode = new TextNode();
        textNode.setText("");
        assertEquals("", textNode.getNodeName());
    }

}