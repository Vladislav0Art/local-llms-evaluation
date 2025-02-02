package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

public class GeneratedNodeName_ReturnsCorrectValue {

    @Test
    public void nodeName_ReturnsCorrectValue() throws IOException {
        String text = "Hello World";
        Node textNode = new Node(text);
        assertEquals("Hello World", textNode.nodeName());
    }

    public static class TextNode {
        private String text;

        public TextNode(String text) {
            this.text = text;
        }

        @Override
        public String nodeName() {
            return text;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public static class NodeCloneTest extends Node {
        private Node original;

        public NodeCloneTest(String text) {
            super(text);
            original = this;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return original;
        }
    }

}