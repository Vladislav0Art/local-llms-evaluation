package org.jsoup.nodes;

public class GeneratedTestTextNode {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public boolean isBlank() {
        return text.isEmpty();
    }

    public void setText(String text) {
        this.text = text;
    }

    public String text() {
        return text;
    }

    public TextNode splitText(int offset) {
        // implement method
        return null;
    }

    public void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) {
        // implement method
    }

    public void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {
        // implement method
    }
}

public class MockAppendable implements Appendable {

    @Override
    public String append(CharSequence csq, int start, int end) throws IOException {
        return "";
    }

    @Override
    public String toString() {
        return "";
    }
}

public class Document {
    private TextNode textNode;

    public Document(TextNode textNode) {
        this.textNode = textNode;
    }

    public static class OutputSettings {
        public boolean prettyPrint;

        public void setPrettyPrint(boolean prettyPrint) {
            // private access in Java, make method public
            this.prettyPrint = true;
        }
    }

    public OutputSettings getOutputSettings() {
        return new OutputSettings();
    }
}

public class GeneratedTest {

    @Test
    public void testTextNode() {
        Document document = new Document(new TextNode(""));
        assert (document.getTextNode().isBlank());
    }

}