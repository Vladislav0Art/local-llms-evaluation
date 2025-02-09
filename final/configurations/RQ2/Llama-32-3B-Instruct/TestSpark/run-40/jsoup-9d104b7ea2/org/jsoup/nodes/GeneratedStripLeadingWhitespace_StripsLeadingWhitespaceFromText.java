package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedStripLeadingWhitespace_StripsLeadingWhitespaceFromText {

    @Test
    public void stripLeadingWhitespace_StripsLeadingWhitespaceFromText() {
        String text = "   ";
        String expected = "";
        assertEquals(expected, TextNode.stripLeadingWhitespace(text));
    }
}

public class TextNode {

    private static final int DEFAULT_BUFFER_SIZE = 16 * 1024;

    public static boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }

    public String getWholeText() {
        // Implementation of getWholeText method
        return "";
    }

    public static String normaliseWhitespace(String text) {
        return text;
    }

    public static String stripLeadingWhitespace(String text) {
        return text.startsWith(" ") ? text.substring(1) : text;
    }

    public TextNode(String encodedText) {
    }

}