package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestConnection {

    // ...

    public static class OutputSettings {
        private String charset;
        private QuirksMode quirksMode;
        private boolean prettyPrint;
        private int indentAmount;
        private int maxPaddingWidth;

        public OutputSettings() {
        }

        public OutputSettings(String charset) {
            this.charset = charset;
        }

        // getters and setters
    }

    public static class Parser {
        private String sourceUrl;
        private Connection connection;

        public Parser() {
        }

        public Parser(String sourceUrl, Connection connection) {
            this.sourceUrl = sourceUrl;
            this.connection = connection;
        }

        // getters and setters
    }
}

// DocumentTest.java
import org.junit.Test;
import static org.junit.Assert .*;

public class DocumentTest {

    @Test
    public void testConnection() {
        Connection connection = new Connection();
        Document document = new Document(connection);

        assertNotNull(document.getConnection());
        assertEquals(connection, document.getConnection());
    }
}

// Parser.java
public class Parser {
    // ...
}

}