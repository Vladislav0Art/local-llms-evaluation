package org.jsoup.nodes;

import java.io.IOException;

import org.jsoup.nodes.TextNode;
import org.jsoup.util.ParseDict;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTestSplitTextPositiveOffset {

    @Mock
    private ParseDict parentNode;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    public static class TextNodeTest extends TextNode {

        @Override
        public int nodeType() {
            return 1;
        }

        @Override
        public String nodeName() {
            return "#text";
        }

        public void testIsBlank() {
            this.isBlank();
        }
    }

    @Test
    public void testSplitTextPositiveOffset() throws IOException {
        TextNodeTest textNode = new TextNodeTest();
        textNode.text("");

        TextNode result1 = textNode.splitText(2);
        TextNode result2 = textNode.splitText(7);

        assertEquals("", result1.value());
        assertEquals("Hello", result2.value());
    }

}