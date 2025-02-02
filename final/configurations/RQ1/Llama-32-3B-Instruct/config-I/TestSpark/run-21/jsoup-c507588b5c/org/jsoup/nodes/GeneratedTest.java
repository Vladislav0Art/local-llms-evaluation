package org.jsoup.nodes;

public class GeneratedTest {

    private String text;

    public TextNode() {
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isBlank() {
        return text.isEmpty();
    }

    public String text() {
        return text;
    }

    public static TextNode createTextNode(String text) {
        return new TextNode(text);
    }

    public static TextNode splitText(int offset, String text) {
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

    public OutputSettings getOutputSettings() {
        // implement method
        return null;
    }
}

public class GeneratedTest {

}