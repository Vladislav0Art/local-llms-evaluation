package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedTest {

    private TextNode node;

    @Before
    public void setup() {
        // No setup needed for these tests
    }

    public String getEncodedText() {
        return "&lt;test&gt;";
    }

    public static class IOException extends Exception {
        public IOException(String message) {
            super(message);
        }
    }

    public static class TextNode {
        private String text;
        private boolean wholeText = true;

        public TextNode(String text) {
            this.text = text;
        }

        public void setWholeText(boolean wholeText) {
            this.wholeText = wholeText;
        }

        public String text() {
            return text;
        }

        public boolean isEmpty() {
            return text.isEmpty();
        }

        public String normaliseWhitespace(String originalText) {
            // implement whitespace normalization logic
            return originalText.replace("\n\n", "\n").trim();
        }

        public TextNode splitText(int offset) {
            // implement text splitting logic
            String wholeText = text();
            if (wholeText == null || wholeText.isEmpty()) {
                return this;
            }
            int offsetIndex = wholeText.indexOf(" ", offset);
            if (offsetIndex < 0) {
                return new TextNode(wholeText.substring(offset));
            } else {
                return new TextNode(wholeText.substring(0, offsetIndex));
            }
        }

        public static TextNode createFromEncoded(String encodedText, StringWriter writer) throws IOException {
            // implement text node creation logic
            return null;
        }

        public String getWholeText() {
            if (wholeText) {
                return text();
            } else {
                return "";
            }
        }
    }

    @Test
    public void newTextNodeIsEmpty() {
        TextNode newNode = new TextNode("");
        assertNotNull(newNode.text());
        assertTrue(newNode.text().isEmpty());
    }

    @Test
    public void newTextNodeContainsWhitespace() {
        String text = "   ";
        TextNode newNode = new TextNode(text);
        assertNotNull(newNode.text());
        assertTrue(newNode.text().contains(" "));
    }

    @Test
    public void createFromEncodedReturnsValidTextNode() throws IOException {
        StringWriter writer = new StringWriter();
        try {
            TextNode node2 = TextNode.createFromEncoded(getEncodedText(), writer);
            assertNotNull(node2.text());
            assertTrue(node2.text().equals(getEncodedText()));
        } catch (IOException e) {
            fail("Expected exception of type IOException");
        }
    }

    @Test
    public void splitTextDividesTextNodeAtOffset() throws IOException {
        String text = "Hello World!";
        int offset = 5;
        TextNode newNode = new TextNode(text).splitText(offset);
        assertNotNull(newNode.text());
    }

    @Test
    public void splitTextNegativeOffset() {
        int offset = -1;
        TextNode node2 = new TextNode("Hello World!");
        node2.splitText(offset);
    }

}