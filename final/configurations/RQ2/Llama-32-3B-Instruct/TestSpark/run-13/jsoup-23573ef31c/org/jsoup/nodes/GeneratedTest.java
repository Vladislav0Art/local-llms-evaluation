package org.jsoup.nodes;

public class GeneratedTest {

    private Object connection;

    public ConnectionImpl(Object connection) {
        this.connection = connection;
    }

    @Override
    public String toString() {
        return "Connection{" +
                "connection=" + connection +
                '}';
    }
}

public class ParserImpl implements Parser {

    private Object parser;

    public ParserImpl(Parser parser) {
        this.parser = parser;
    }

    @Override
    public String toString() {
        return "Parser{" +
                "parser=" + parser +
                '}';
    }

    public void setParser(Parser parser) {
        this.parser = parser;
    }
}

public class DocumentImpl implements Document {

    private Connection connection;
    private String baseUri;

    public DocumentImpl(String baseUri, Connection connection) {
        this.baseUri = baseUri;
        this.connection = connection;
    }

    @Override
    public String toString() {
        return "Document{" +
                "connection=" + connection +
                ", baseUri='" + baseUri + '\'' +
                '}';
    }
}

public class ElementImpl implements Element {

    private String name;

    public ElementImpl(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Element{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}

public class DocumentTest {

    private static ConnectionImpl connection;

    public static void main(String[] args) {
        setUp();
        testGetConnection();
        testCreateDocument();
    }

    @BeforeAll
    public static void setUp() {
        connection = new ConnectionImpl(new Object());
    }

}