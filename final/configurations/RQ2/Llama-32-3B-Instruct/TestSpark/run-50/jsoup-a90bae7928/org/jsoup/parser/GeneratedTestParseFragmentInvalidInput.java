package org.jsoup.parser;

public class GeneratedTestParseFragmentInvalidInput {

    @Mock
    private Reader inputReader;

    @Mock
    private String baseUri;

    @Mock
    private Parser parser;

    @Mock
    private ParseSettings parseSettings;

    public void setup() {
    }

    @Test
    public void testParseFragmentInvalidInput() {
        // no implementation provided
    }
}

public class XmlTreeBuilder {

    public boolean initialiseParse(Reader inputReader, String baseUri, Parser parser) {
    }

    public Document parse(Reader inputReader, String baseUri) {
        return null;
    }

    public Element insert(Token token) {
        return null;
    }

    public boolean process(Reader inputReader, Parser parser) {
        return false;
    }

    public void popStackToClose(Parser parser) {
    }

    public List<Node> parseFragment(ParseSettings settings) {
        return new ArrayList<>();
    }
}

public class Document {

    private String document;

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}

public class Element {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Node extends Element {
}

}