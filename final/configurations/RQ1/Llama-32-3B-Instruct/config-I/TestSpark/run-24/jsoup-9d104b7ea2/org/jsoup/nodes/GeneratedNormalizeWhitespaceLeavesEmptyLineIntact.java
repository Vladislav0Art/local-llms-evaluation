package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedNormalizeWhitespaceLeavesEmptyLineIntact {

    private TextNode node;

    @Before
    public void setup() {
        // No setup needed for these tests
    }

    public String getEncodedText() {
        return "&lt;test&gt;";
    }

    public static class TextNode {
        private String text;

        public TextNode(String text) {
            this.text = text;
        }

        public boolean isEmpty() {
            return text.isEmpty();
        }

        public String text() {
            return text;
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
    }

    @Test
    public void normalizeWhitespaceLeavesEmptyLineIntact() {
        String originalText = "\n\n";
        String normalizedText = node.normaliseWhitespace(originalText);
        assertEquals("\n\n", normalizedText);
    }

}