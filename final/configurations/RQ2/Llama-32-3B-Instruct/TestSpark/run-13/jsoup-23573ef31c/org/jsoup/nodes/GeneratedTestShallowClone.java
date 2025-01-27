package org.jsoup.nodes;

public class GeneratedTestShallowClone {

    private Object connection;

    public Connection(Connection connection) {
        this.connection = connection;
    }

    @Override
    public String toString() {
        return "Connection{" +
                "connection=" + connection +
                '}';
    }
}

public class Parser {
    private Object parser;

    public Parser(Parser parser) {
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

public class Document {
    private Connection connection;
    private String baseUri;

    public Document(String baseUri, Connection connection) {
        this.baseUri = baseUri;
        this.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }

    @Override
    public String toString() {
        return "Document{" +
                "connection=" + connection +
                ", baseUri='" + baseUri + '\'' +
                '}';
    }
}

public class Element {
    private String name;

    public Element(String name) {
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

    private static Connection connection;

    @BeforeAll
    public static void setUp() {
        // implement setup method
    }

    @Test
    public void testShallowClone() {
        connection = new Connection(new Object());
        document = new Document("baseUri", connection);
        Document shallowClone = document.shallowClone();
        assertNotNull(shallowClone);
        assertEquals(connection, shallowClone.getConnection());
    }

}