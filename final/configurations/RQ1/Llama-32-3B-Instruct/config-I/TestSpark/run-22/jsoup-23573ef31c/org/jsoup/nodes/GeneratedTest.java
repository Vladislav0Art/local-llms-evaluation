package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTest {

    private String document;

    public static Document createDocument(String document) {
        return new Document(document);
    }

    public String getDocument() {
        return document;
    }
}

// ParserImpl.java
public abstract class ParserImpl implements Serializable {
    protected Connection connection;

    public static Connection getConnection(Connection connection) {
        Validate.notNull(connection);
        return connection;
    }
}

// Connection.java
public interface Connection {
    Object newRequest();
}

// OutputSettings.java
public class OutputSettings {
    private QuirksMode quirksMode;

    public static OutputSettings createOutputSettings() {
        return new OutputSettings();
    }

    public OutputSettings setQuirksMode(QuirksMode quirksMode) {
        this.quirksMode = quirksMode;
        return this;
    }
}

// Parser.java
public interface Parser {
    Object createNewRequest(Object object);
}

// QuirksMode.java
public enum QuirksMode {
    noQuirks,
    quirks,
    limitedQuirks
}

// DocumentTest.java
import org.junit.Test;

public class DocumentTest {

}