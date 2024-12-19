package org.jsoup.nodes;

import java.io.IOException;

import org.jsoup.nodes.TextNode;
import org.jsoup.util.ParseDict;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTestIsBlank {

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
    public void testIsBlank() {
        TextNodeTest textNode = new TextNodeTest();
        textNode.text("   ");
        assertTrue(textNode.isBlank());
        textNode.text("");
        assertFalse(textNode.isBlank());
    }

}