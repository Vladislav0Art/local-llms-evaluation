package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestcreateFromEncoded {

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
    public void testcreateFromEncoded() {
        Node node = new Node();
        String encodedText = "some text";
        TextNode result = node.createFromEncoded(encodedText);
        assertNotNull(result);
    }

}