package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestLastCharIsWhitespace {

    public class TextNode {
        private String value;

        public TextNode(String value) {
            this.value = value;
        }

        public String outerHtmlHead(Appendable accum, int depth, StringWriter out) throws IOException {
            // implement your logic here
            return "";
        }

        public String outerHtmlTail(Appendable accum, int depth, StringWriter out) throws IOException {
            // implement your logic here
            return "";
        }

        public static TextNode createFromEncoded(String encodedText) {
            // implement your logic here
            return null;
        }
    }

    @Test
    public void testLastCharIsWhitespace() {
        Node node = new Node();
        String text = "   some text  ";
        assertTrue(node.lastCharIsWhitespace(text));
    }
}

public class Node {
    private String value;

    public Node() {
    }

    public String outerHtmlHead(Appendable accum, int depth, StringWriter out) throws IOException {
        // implement your logic here
        return "";
    }

    public String outerHtmlTail(Appendable accum, int depth, StringWriter out) throws IOException {
        // implement your logic here
        return "";
    }

    public static TextNode createFromEncoded(String encodedText) {
        // implement your logic here
        return null;
    }

    private String normaliseWhitespace(String text) {
        // implement your logic here
        return "";
    }

    private String stripLeadingWhitespace(String text) {
        // implement your logic here
        return "";
    }

    public boolean lastCharIsWhitespace(String text) {
        // implement your logic here
        return false;
    }

}