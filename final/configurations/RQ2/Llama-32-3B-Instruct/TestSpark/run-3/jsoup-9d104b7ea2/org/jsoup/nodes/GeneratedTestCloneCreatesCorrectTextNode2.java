package org.jsoup.nodes;

public class GeneratedTestCloneCreatesCorrectTextNode2 {

    private String text;

    public Node() {
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node that = (Node) o;
        return Objects.equals(text, that.text);
    }

    public String toString() {
        return "Node{" +
                "text='" + text + '\'' +
                '}';
    }
}

public class TextElement {
    private String text;

    public TextElement(String text) {
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextElement that = (TextElement) o;
        return Objects.equals(text, that.text);
    }

    public String getText() {
        return text;
    }
}

public class TextNode {
    private String text;

    public TextNode(String text) {
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextNode that = (TextNode) o;
        return Objects.equals(text, that.text);
    }
}

public class NodeTest {

    @Before
    public void setUp() {
    }

    @Test
    public void testCloneCreatesCorrectTextNode2() {
        TextNode node = new TextNode("World");
        TextElement cloned = (TextElement) node.clone();
        assertEquals(node.getText(), cloned.getText());
    }

}