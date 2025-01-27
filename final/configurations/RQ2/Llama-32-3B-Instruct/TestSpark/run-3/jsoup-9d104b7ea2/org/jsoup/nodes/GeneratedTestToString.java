package org.jsoup.nodes;

public class GeneratedTestToString {

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
    public void testToString() {
        Node node = new Node();
        when(Node::toString).thenReturn("");
    }
}

public class CloneTest {

    @Before
    public void setUp() {
    }

}