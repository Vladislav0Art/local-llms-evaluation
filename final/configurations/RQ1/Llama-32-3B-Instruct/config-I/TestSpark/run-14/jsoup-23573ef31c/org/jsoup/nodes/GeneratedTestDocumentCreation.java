package org.jsoup.nodes;

public class GeneratedTestDocumentCreation {

    private String text;

    public Node(String text) {
        this.text = text;
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

    public boolean outputSettings() {
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

    @Test
    public void testDocumentCreation() {
        // Given
        String htmlString = "<html><body>Hello World!</body></html>";
        Node node = new Node("Hello World!");
        OutputSettings outputSettings = new OutputSettings(true);
        Document document = new Document(htmlString);

        // When
        assertEquals(1, document.getChildren().size());
        assertEquals(node.getText(), ((Document) document.getBody()).getText());

        // Then
    }

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.nodes.GenerTest");
    }

}