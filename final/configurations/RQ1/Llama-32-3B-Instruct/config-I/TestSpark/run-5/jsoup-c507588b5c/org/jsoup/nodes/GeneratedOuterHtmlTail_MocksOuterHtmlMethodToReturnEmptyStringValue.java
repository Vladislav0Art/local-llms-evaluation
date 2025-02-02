package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtmlTail_MocksOuterHtmlMethodToReturnEmptyStringValue {

    @Test
    public void OuterHtmlTail_MocksOuterHtmlMethodToReturnEmptyStringValue() {
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("");
        String expectedHtml = "";
        when(accum.append(any(), any())).thenReturn(expectedHtml);

        String html = textNode.outerHtmlTail(accum, depth, out);
        assertEquals(expectedHtml, html);
    }

    public class TextNode {
        private String text;

        public TextNode(String text) {
            this.text = text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }

        public TextNode splitText(int offset) {
            // implement splitting logic
            return new TextNode(text.substring(offset));
        }

        public String outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) {
            // implement HTML head generation
            return "<html><head></head>";
        }

        public String outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {
            // implement HTML tail generation
            return "</html>";
        }

        public boolean isBlank() {
            return text.isEmpty();
        }
    }

}