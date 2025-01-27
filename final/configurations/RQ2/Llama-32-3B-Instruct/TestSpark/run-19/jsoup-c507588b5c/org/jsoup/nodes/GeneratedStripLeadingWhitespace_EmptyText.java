package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedStripLeadingWhitespace_EmptyText {

    @Mock
    private Appendable accum;

    @Test
    public void stripLeadingWhitespace_EmptyText() {
        when(Document.normaliseWhitespace(any())).thenReturn("");
        assertEquals("", Document.stripLeadingWhitespace(""));
    }
}

public class LeafNode {

    public String nodeName() {
        // implementation
    }

    public String text() {
        // implementation
    }

    public String getWholeText() {
        // implementation
    }

    public boolean isBlank() {
        // implementation
    }

    public TextNode splitText(int offset) {
        // implementation
    }

    void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        // implementation
    }

    void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {
        // implementation
    }

    @Override
    public String toString() {
        return "LeafNode";
    }

    @Override
    public TextNode clone() {
        return this;
    }

    public static TextNode createFromEncoded(String encodedText) {
        // implementation
    }
}

public class Document {

    public static String normaliseWhitespace(String text) {
        // implementation
    }

    public static String stripLeadingWhitespace(String text) {
        // implementation
    }

    public static boolean lastCharIsWhitespace(StringBuilder sb) {
        // implementation
    }

}