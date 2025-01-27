package org.jsoup.nodes;

public class GeneratedNodeName {

    @Override
    public Appendable append(CharSequence csf, int start, int end) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Appendable append(CharSequence csq) {
        throw new UnsupportedOperationException();
    }
}

public class TextNode {

    private String text;

    public TextNode() {
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void text(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}

public class GeneratedTest {

    private Document documentBuilder = new Document();
    private TextNode node;

    public void setUp() {
        node = new TextNode();
        node.setText("Hello World");
    }

    @Test
    public void nodeName() {
        assertEquals("text", node.getText());
    }

}