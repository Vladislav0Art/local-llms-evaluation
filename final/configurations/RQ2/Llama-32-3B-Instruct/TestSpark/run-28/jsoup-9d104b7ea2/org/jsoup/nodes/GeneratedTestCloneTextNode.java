package org.jsoup.nodes;

public class GeneratedTestCloneTextNode {

    private Document document;

    @Before
    public void setUp() {
        document = new Document();
    }

    @Test
    public void testCloneTextNode() {
        TextNode textNode = document.createTextNode("test");
        boolean result = document.cloneTextDocument(textNode);

        assertTrue(result);
    }
}

public class Document {

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public TextNode createTextNode(String text) {
        return new TextNode(text);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.equals(text, document.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    public boolean equals(Document.OutputSettings other) {
        return text.equals(other.getText());
    }
}

public class TextNode {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextNode textNode = (TextNode) o;
        return Objects.equals(text, textNode.text);
    }
}

public class Document.

OutputSettings {

    private String getText () {
        // implementation
        return "";
    }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document.OutputSettings settings = (Document.OutputSettings) o;
        return Objects.equals(getText(), settings.getText());
    }

}