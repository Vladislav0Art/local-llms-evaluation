package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestOutputSettings {

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

}