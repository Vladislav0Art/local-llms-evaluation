package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;

public class GeneratedStripLeadingWhitespace_EmptyString_ReturnsEmptyString {

    public static String normaliseWhitespace(String text);

    public static boolean isBlank(String text);

    public static String stripLeadingWhitespace(String text);
}

public class TextNodeImpl implements TextNode {

    private String text;

    public TextNodeImpl(String text) {
        this.text = text;
    }

    @Override
    public String text() {
        return text;
    }

    @Override
    public String nodeName() {
        return "text-node";
    }

    @Override
    public void outerHtmlHead(Appendable appendable, int offset, String document_OUTPUT_SETTINGS) {
        // Implementation
    }

    @Override
    public void outerHtmlTail(Appendable appendable, int offset, String document_OUTPUT_SETTINGS) {
        // Implementation
    }
}

public class TestSpark {

    @Test
    public void stripLeadingWhitespace_EmptyString_ReturnsEmptyString() {
        assertEquals("", TextNode.stripLeadingWhitespace(""));
    }

}