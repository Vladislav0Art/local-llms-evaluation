package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

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
    public void testOutputSettings() {
        OutputSettings outputSettings = new Document.OutputSettings();
        assertEquals("", outputSettings.getCharset());
        assertTrue(outputSettings.isPrettyPrint());
        assertEquals(0, outputSettings.getIndentAmount());
        assertEquals(-1, outputSettings.getMaxPaddingWidth());

        outputSettings = new Document.OutputSettings("utf-8");
        assertEquals("utf-8", outputSettings.getCharset());
        assertTrue(outputSettings.isPrettyPrint());
        assertEquals(0, outputSettings.getIndentAmount());
        assertEquals(-1, outputSettings.getMaxPaddingWidth());

        outputSettings = new Document.OutputSettings();
        outputSettings.setCharset("utf-8");
        assertEquals("utf-8", outputSettings.getCharset());
        assertTrue(outputSettings.isPrettyPrint());
        assertEquals(0, outputSettings.getIndentAmount());
        assertEquals(-1, outputSettings.getMaxPaddingWidth());
    }

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