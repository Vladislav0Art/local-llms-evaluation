package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestOuterHtmlTail {

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
    public void testOuterHtmlTail() throws IOException {
        Node node = new Node();
        Appendable accum = java.lang.StringBuilder.toString();
        StringWriter out = new StringWriter();
        try {
            String result = node.outerHtmlHead(accum, 1, out);
            // implement assertions here
        } catch (IOException e) {
            fail("Expected no exception");
        }
    }

}