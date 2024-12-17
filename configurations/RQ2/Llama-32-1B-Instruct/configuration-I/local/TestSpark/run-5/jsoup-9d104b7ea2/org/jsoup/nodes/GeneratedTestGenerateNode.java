package org.jsoup.nodes;

public class GeneratedTestGenerateNode {

    @Test
    public void testGenerateNode() {
        Node node = new Node("Hello World");
        String expectedString = "Hello World";
        assertEquals(expectedString, node.stripLeadingWhitespace().getText());
    }
}

class Node {
    private String text;
    private Document document;

    public Node(String text) {
        this.text = text;
        document = new Document();
        outerHtmlHead(document, 0, document.getAccumulator().EMPTY);
    }

    public String stripLeadingWhitespace() {
        return stripLeadingWhitespace(text());
    }

    public StringBuilder getText() {
        return new StringBuilder(text).append("");
    }
}

class Document {
    private List<Node> nodes;

    public void outerHtmlHead(Document doc, int index, String accumulator) {
        if (index < 0 || accumulator.size() == 0) {
            throw new RuntimeException("Invalid document state");
        }
        for (int i = 0; i < accumulator.size(); i++) {
            Node node = accumulator.get(i);
            appendNode(doc, node.text());
        }
    }

    public void appendNode(Document doc, String text) {
        if (!text.isEmpty()) {
            appendChild(doc, new TextNode(text));
        }
    }

    public List<Node> getAccumulator() {
        return nodes;
    }
}

class DocumentBuilder {
    private Document document;

    public DocumentBuilder() {
        document = new Document();
    }

    public void outerHtmlHead(Document doc, int index, String accumulator) {
        if (index < 0 || accumulator.size() == 0) {
            throw new RuntimeException("Invalid document state");
        }
        for (int i = 0; i < accumulator.size(); i++) {
            Node node = accumulator.get(i);
            appendNode(doc, node.text());
        }
    }

    public void appendNode(Document doc, String text) {
        if (!text.isEmpty()) {
            appendChild(doc, new TextNode(text));
        }
    }

    public List<Node> getAccumulator() {
        return document.getNodes();
    }
}

class DocumentBuilderImpl extends DocumentBuilder {
    @Override
    public void outerHtmlHead(Document doc, int index, String accumulator) {
        super.outerHtmlHead(doc, index, accumulator);
        appendNode(doc, accumulator.toString());
    }

    @Override
    public List<Node> getAccumulator() {
        return document.getNodes();
    }
}

class DocumentBuilderImpl2 extends DocumentBuilderImpl {
    private Stack<String> textStack = new Stack<>();

    @Override
    public void outerHtmlHead(Document doc, int index, String accumulator) {
        if (index < 0 || accumulator.size() == 0) {
            throw new RuntimeException("Invalid document state");
        }
        for (int i = 0; i < accumulator.size(); i++) {
            Node node = accumulator.get(i);
            appendNode(doc, textStack.pop());
        }
    }

    @Override
    public List<Node> getAccumulator() {
        return new ArrayList<>(document.getNodes());
    }

    private void appendNode(Document doc, String text) {
        if (!text.isEmpty()) {
            document.appendText(text).append("");
            textStack.push(text);
        } else {
            textStack.pop();
        }
    }
}

class TextNode extends Node {
    public TextNode(String text) {
        super(text);
    }

    @Override
    public String getText() {
        return text;
    }

}