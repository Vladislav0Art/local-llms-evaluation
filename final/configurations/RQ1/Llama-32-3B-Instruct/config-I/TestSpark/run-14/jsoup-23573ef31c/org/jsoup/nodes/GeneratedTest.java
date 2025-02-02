package org.jsoup.nodes;

public class GeneratedTest {

    private String text;

    public Node(Node node) {
        this.text = node.getText();
    }

    public String getText() {
        return text;
    }
}

public class OutputSettings {
    private boolean prettyPrint;

    public OutputSettings(boolean prettyPrint) {
        this.prettyPrint = prettyPrint;
    }

    public Object outputSettings() {
        return prettyPrint;
    }
}

public class Parser {
    // Add methods or implementation here
}

public class Document {
    private List<Node> children = new ArrayList<>();

    public Document(String htmlString) {
        // implementation
    }

    public Node getBody() {
        if (children.isEmpty()) {
            throw new RuntimeException("No body found in the document");
        }
        return children.get(0);
    }

    public List<Node> Children() {
        return children;
    }
}

public class DocumentTest {

}