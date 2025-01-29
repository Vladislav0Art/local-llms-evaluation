package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

public class GeneratedOuterHtmlTailTestsTextNode_outerHtmlTail {

    @Test
    public void outerHtmlTailTestsTextNode_outerHtmlTail() {
        Appendable accum = new StringBuilder();
        int depth = 1;
        Document outputSettings = new org.w3c.dom.Document();
        when(node.outerHtmlTail(accum, depth, outputSettings)).thenReturn("Hello, World!");
        assertEquals("Hello, World!", node.outerHtmlTail(accum, depth, outputSettings));
    }

    public static class TestNode {
        private String text;

        public TestNode(String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }

        @Override
        public boolean isBlank() {
            return false;
        }

        @Override
        public int getWholeText() {
            return 0;
        }
    }

}