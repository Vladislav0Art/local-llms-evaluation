package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestParser {

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
    public void testParser() {
        Parser parser = new Document.Parser();
        assertNull(parser.getSourceUrl());
        assertNull(parser.getConnection());

        parser = new Document.Parser("https://example.com", null);
        assertNotNull(parser.getSourceUrl());
        assertNull(parser.getConnection());

        parser = new Document.Parser(null, new Connection());
        assertNotNull(parser.getSourceUrl());
        assertNotNull(parser.getConnection());
    }

}