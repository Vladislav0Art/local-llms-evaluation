package org.jsoup.parser;

public class GeneratedTest {

    private String value;

    public Node(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                '}';
    }
}

public class Document {
    private String text;

    public Document(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Document{" +
                "text='" + text + '\'' +
                '}';
    }
}

public class DocumentType {
    private String type;

    public DocumentType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "DocumentType{" +
                "type='" + type + '\'' +
                '}';
    }
}

public class TreeBuilder {
    public static Node parseFragment(String example, String token, String parser) {
        // implementation of parseFragment method
        return new Node(token);
    }

    public Document generateDocument(String text1, String text2) {
        // implementation of generateDocument method
        return new Document(text1 + " " + text2);
    }
}

public class TreeBuilderStub extends TreeBuilder {
    @Override
    public Node parseFragment(String example, String token, String parser) {
        return new Node(token);
    }

    @Override
    public Document generateDocument(String text1, String text2) {
        return new Document(text1 + " " + text2);
    }
}

public class TreeBuilderTest {

}